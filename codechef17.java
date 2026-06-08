
import java.util.Scanner;

public class codechef17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int i;
        for (i = 0; i < a; i=i+2) {
        if (i % 2 != 0) {
            sum = sum + i;
        }
        }
        
        System.out.println(sum);
    }
}
