import java.util.Scanner;

public class code16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            for (int j = 0; j < i ; j++) {
                if (a[j] > a[j + 1]) {
                    int swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                    // count++;
                }
                // if (count == 0) {
                //     break;
                // }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}