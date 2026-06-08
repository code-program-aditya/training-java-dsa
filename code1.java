
import java.util.Scanner;

public class code1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array = sc.nextLine();
        if (array.contains("H") || array.contains("Q") || array.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
