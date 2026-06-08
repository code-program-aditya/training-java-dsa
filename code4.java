import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int j =0; j<3;j++){
        String a= sc.next();
        int d = sc.nextInt();
        System.out.printf("%-13s%03d%n", a, d);
        }
        System.out.println("================================");
    }
}
