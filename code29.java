import java.util.Scanner;

public class code29 {
    public static void recursion(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        // recursive call first
        recursion(n - 1);
        // print while recursive
        System.out.print(" " +n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n);
    }
}