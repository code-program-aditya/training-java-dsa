import java.util.Scanner;

public class code31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                if (n < 10) {
                    System.out.println(1);
                    break;
                }
                break;
            case 2:
                if (n > 10) {
                    System.out.println(0);
                    break;
                }
                break;

            default:
                System.out.println("Other");
                break;
        }
    }
}
