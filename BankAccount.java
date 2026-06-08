public class BankAccount {
    String accountname;
    String dob;
    String accounttype;
    double balance;
    
    void display(){
        System.out.println("customer " + accountname + " | dob :" + dob + " | type :" + accounttype + " | balance Rs." + balance);
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountname = "John";
        account.dob = "01-01-1990";
        account.accounttype = "Savings";
        account.balance = 10000;
        account.display();
    }
}