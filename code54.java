import java.util.Scanner;

public class code54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        concatAndPrint(a, b);
    }

    public static void concatAndPrint(String a, String b) {
        System.out.println(a + b);
    }
}
