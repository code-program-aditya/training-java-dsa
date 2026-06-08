import java.util.Scanner;

public class code20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            int sum = (n % 2 == 1) ? x : 0;
            System.out.println(sum);
        }

        sc.close();
    }
}