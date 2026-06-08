
import java.util.Scanner;

public class codechef30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = new String(str);
        reverse(str);
    }

    public static void reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        //if (str.equals(sb.toString())) {
            //System.out.println("yes is palindrome");
        //} else {
            //System.out.println("no is not palindrome");
        //}
    }
}
