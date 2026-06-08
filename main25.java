import java.lang.FunctionalInterface;
import java.lang.ArithmeticException;

public class main25 {
    public static void main(String[] args) {
        calculator addition = (a,b) -> (a+b);
        System.out.println("the addition of 3 and 5 is " + addition.operate(3, 5));
        calculator multiplication = (a,b) -> (a*b);
        System.out.println("the multiplication of 3 and 5 is " + multiplication.operate(3, 5));
        calculator subtraction = (a,b) -> (a-b);
        System.out.println("the subtraction of 3 and 5 is " +subtraction.operate(3, 5));
        calculator division = (a,b) -> {
            try{
                return a/b;
            }
            catch(ArithmeticException e){
                System.out.println(e);
                return 0;
            }
        };
        System.out.println("the division of a and b is : " + division.operate(10, 0));
    }
}
@FunctionalInterface
interface calculator{
            int operate(int a, int b);
}