import java.util.Scanner;

public class code55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPrimeFactorization(n);
    }
    public static void printPrimeFactorization(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        if ( fact > 2){
            
        }
    }
}