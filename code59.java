import java.util.Scanner;

public class code59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ( a>0 && b>0){
            int result = a*b;
            System.out.println(result);
        }
        else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
