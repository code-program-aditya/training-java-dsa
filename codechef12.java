
import java.util.Scanner;

public class codechef12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 90 && a <= 100) {
            System.out.println("Grade A");
        } else if (a >= 80) {
            System.out.println("Grade B");
        } else if (a >= 70) {
            System.out.println("Grade C");
        } else if (a >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
        sc.close();
    }
}
