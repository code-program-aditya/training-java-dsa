//overloading
public class main9 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(5,10));
        System.out.println(c1.add(5, 10));
        System.out.println(c1.add(5, 10, 52));
    }
}
class Calculator {
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add (int a, int b, int c){
        return a + b + c;
    }
}