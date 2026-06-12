import java.util.*;

public class AlternatingSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();

            // The sequence is: x, -x, x, -x, ...
            // If n is odd, we have one more x than -x, so sum = x
            // If n is even, they cancel out, so sum = 0
            int sum = (n % 2 == 1) ? x : 0;

            System.out.println(sum);
        }

        sc.close();
    }
}
