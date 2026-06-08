import java.util.Scanner;

public class codechef39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int count = 0;
        for(int i =0; i < a; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            if ((n+m+k) >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
