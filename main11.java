public class main11 {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.printDocument(15);
        p1.printDocument("aditya raj");
    }
}
class Printer{
    void printDocument(int a){
    System.out.println("number of copies: " + a);
    }
    void printDocument(String b){
    System.out.println("a secret message: " + b);
    }
}
//overload method