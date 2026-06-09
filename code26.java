import java.util.Scanner;

public class code26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String v = sc.nextLine();
        boolean isPalindrome = Palindrome(v);
        System.out.println(isPalindrome);
    }

    static boolean Palindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
}
