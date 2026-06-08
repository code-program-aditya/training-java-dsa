public class main3 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Aditya raj", "21-07-2007", "saving", 200000);
        account1.displsy();
    }
}
class BankAccount {
    String accountname;
    String accounttype;
    double balance;
    String dob;
public BankAccount(String accountholder, String dateofbirth, String type, double Accountbalance){
    accountname= accountholder;
    dob= dateofbirth;
    accounttype= type;
    balance= Accountbalance;
}
void displsy(){
    System.out.println("coustomer :" + accountname + "| dob :" +dob+ "| type :" +accounttype+ "| balance Rs." +balance);
}
}
