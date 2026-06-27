import java.util.Scanner;

public class code58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line =1;
        while (scanner.hasNext()) {
            String a = scanner.nextLine();
            System.out.println(line + " " + a);
            line++;
        }
    }
}
