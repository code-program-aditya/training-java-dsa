import java.util.Scanner;

public class code49 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int a = Scanner.nextInt();
        int b = Scanner.nextInt();
        int operator = Scanner.nextInt();
        int result = calculate(a, b, operator);
        System.out.println(result);
    }

    public static int calculate(int a, int b, int operator) {
        int result = 0;
        switch (operator) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        return result;
    }
}