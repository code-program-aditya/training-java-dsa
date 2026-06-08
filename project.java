import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BankSystem> accounts = new ArrayList<>();
        while (true) {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Update Account Name");
            System.out.println("5. Delete Account");
            System.out.println("6. Show All Accounts");
            System.out.println("7. Exit");
            System.out.print("\nEnter Choice: ");
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Please enter a number!");
                continue;
            }
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a number!");
                continue;
            }
            switch (choice) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Enter Account Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Account Number: ");
                    int number = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Account Type: ");
                    String type = sc.nextLine();
                    System.out.print("Enter Balance: ");
                    double balance = sc.nextDouble();
                    accounts.add(new BankSystem(name, number, type, balance));
                    System.out.println("Account Created Successfully");
                }
                case 2 -> {
                    System.out.print("Enter Account Number: ");
                    int accNum = sc.nextInt();
                    BankSystem acc = findAccount(accounts, accNum);
                    if (acc != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double depositAmount = sc.nextDouble();
                        acc.deposit(depositAmount);
                        acc.saveToFile();
                    } else {
                        System.out.println("Account not found!");
                    }
                }
                case 3 -> {
                    System.out.print("Enter Account Number: ");
                    int accNum = sc.nextInt();
                    BankSystem acc = findAccount(accounts, accNum);
                    if (acc != null) {
                        System.out.print("Enter Withdraw Amount: ");
                        double withdrawAmount = sc.nextDouble();
                        acc.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found!");
                    }
                }
                case 4 -> {
                    System.out.print("Enter Account Number: ");
                    int accNum = sc.nextInt();
                    BankSystem acc = findAccount(accounts, accNum);
                    if (acc != null) {
                        sc.nextLine();
                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();
                        acc.updateName(newName);
                        acc.saveToFile();
                    } else {
                        System.out.println("Account not found!");
                    }
                }
                case 5 -> {
                    System.out.print("Enter Account Number: ");
                    int accNum = sc.nextInt();
                    BankSystem acc = findAccount(accounts, accNum);
                    if (acc != null) {
                        accounts.remove(acc);
                        acc.deleteAccount();
                        acc.saveToFile();
                        System.out.println("Account Deleted Successfully");
                    } else {
                        System.out.println("Account not found!");
                    }
                }
                case 6 -> {
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts available.");
                    } else {
                        for (BankSystem acc : accounts) {
                            acc.showHistory();
                        }
                    }
                }
                case 7 -> {
                    System.out.println("Thank You");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }
    
    public static BankSystem findAccount(ArrayList<BankSystem> accounts, int accNum) {
        for (BankSystem acc : accounts) {
            if (acc.getAccountNumber() == accNum) {
                return acc;
            }
        }
        return null;
    }
}

class BankSystem {
    private String AccountName;
    private int AccountNumber;
    private String AccountType;
    private double Balance;
    private String History = "";

    public BankSystem(String AccountName, int AccountNumber, String AccountType, double Balance) {
        this.AccountName = AccountName;
        this.AccountNumber = AccountNumber;
        this.AccountType = AccountType;
        this.Balance = Balance;
        History += "Account created with balance: " + Balance + "\n";
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
            History += "Deposited: " + amount + "\n";
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double Amount) {
        try {
            if (Amount <= 0) {
                throw new Exception("Withdrawal amount must be positive!");
            } else if (Amount > Balance) {
                throw new Exception("Insufficient balance!");
            } else {
                Balance -= Amount;
                History += "Withdrawn: " + Amount + "\n";
                System.out.println("Withdrawn: " + Amount);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            History += "Failed withdrawal attempt: " + Amount + " (" + e.getMessage() + ")\n";
        }
    }

    public void updateName(String newName) {
        AccountName = newName;
        History += "Account name updated to: " + newName + "\n";
        System.out.println("Account name updated successfully");
    }

    public void deleteAccount() {
        History += "Account deleted\n";
    }

    public void showHistory() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Name    : " + AccountName);
        System.out.println("Account Number  : " + AccountNumber);
        System.out.println("Account Type    : " + AccountType);
        System.out.println("Current Balance : " + Balance);
        System.out.println("\n----- Transaction History -----");
        System.out.println(History);
    }

    public void saveToFile() {
        try (FileWriter writer = new FileWriter("accounts.txt", true)) {
            writer.write("\n----- Account Details -----\n");
            writer.write("Account Name    : " + AccountName + "\n");
            writer.write("Account Number  : " + AccountNumber + "\n");
            writer.write("Account Type    : " + AccountType + "\n");
            writer.write("Current Balance : " + Balance + "\n");
            writer.write("\n----- Transaction History -----\n");
            writer.write(History + "\n");
            writer.write("=====================================\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
