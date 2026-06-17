import java.util.Scanner;

public class codechef43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int f = 0;
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            if (height > h) {
                f+= 2;
            } else {
                f+= 1;
            }
        }
        System.out.println(f);
    }
}
