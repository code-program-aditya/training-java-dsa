public class main13 {
    public static void main(String[] args) {
        //BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        //b1.Deposit(-5000);
        b2.Deposit(3000);
        //System.out.println(b1.getBalance());
        System.out.println(b2.getBalance());
        b2.withdraw(4000);
        System.out.println(b2.getBalance());
    }
}
class BankAccount {
    private int Balance;
    public void Deposit(int Amount){ // setter
        if(Amount>0){
            Balance += Amount;
        }
        else {
            System.out.println("invalid amount");
        }
        Balance+= Amount;
    }
    public int getBalance(){ // getter
        return Balance;
    }
    public void withdraw(int Amount){
        if (Amount < 0){
            System.out.println("Invalid amount");
        }
        else if (Amount>Balance){
            System.out.println("insufficient funds");
        }
        else {
            Balance = Balance - Amount;
        }
    }
}