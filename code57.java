import java.util.Scanner;

public class code57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = (a*i) - (b*i);
            System.out.print(result);
        }
    }
}
