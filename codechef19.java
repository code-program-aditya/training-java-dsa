
import java.util.Scanner;

public class codechef19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
                int a = num % 10;
                num /=10;
                sum += a;
        }
        System.out.println(sum);
        if (sum % 5 == 0 && sum % 6 == 0) {
            System.out.println("Yes the sum is divisible by 5 and 6");
        } else if(sum % 6 == 0) {
            System.out.println("Yes the sum is divisible by 6");
        } else if(sum % 5 == 0) {
            System.out.println("Yes the sum is divisible by 5");
        } else {
            System.out.println("invalid input");
        }
    }
}