import java.util.Scanner;

public class code53 {
    public static void main(String[] args) {
        getInput();
    }

    static void getInput() {
        Scanner sc = new Scanner(System.in);
        
            int a = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(a);
            System.out.println(s);
    }
}
