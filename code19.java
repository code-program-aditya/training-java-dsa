import java.util.Scanner;

public class code19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] d = n.split(" ");
        for (String s : d) {
            System.out.print(s + "\n");
        }
    }
}
