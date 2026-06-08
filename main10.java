//override
public class main10 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(5,10));
        System.out.println(c1.add(55.25, 100.65));
        System.out.println(c1.add(5, 10, 52));
        Advancedcalculator  c2 = new Advancedcalculator();
        System.out.println(c2.add(10,5));
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
class Advancedcalculator extends Calculator{
    @Override
    int add(int a,int b){
        System.out.println("The Method overriden!!");
        return a+b;
    }
}