
import java.util.Scanner;

public class codechef29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int r= sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();
            int sum = r + g + b;
            int max = Math.max(r, Math.max(g, b));
            int largest = sum - max;
            if (max-1 <= largest) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        
    }
}