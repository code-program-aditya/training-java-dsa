import java.util.Scanner;

public class code43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int o = sc.nextInt();
        int f =0;
        for(int i =0; i<d; i++){
            int h = sc.nextInt();
            if (h == o) {
                f++;
            }
        }
    }
}
