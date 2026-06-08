
import java.util.Scanner;

public class codechef10 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a;
            System.out.print("Enter a number: ");
            a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
