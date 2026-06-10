import java.util.Scanner;

public class code32 {
    public static int Fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0; i<n; i++){
        System.out.println(" " + Fibonacci(i));
        }
        System.out.println(" sum ="+Fibonacci(n));
    }
}
