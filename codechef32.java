
import java.util.Scanner;

public class codechef32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean result = isPalindrome(s);
        System.out.println("Output: " + result);

        sc.close();
    }

    public static boolean isPalindrome(String s) {
        // Step 1: Clean string (remove non-alphanumeric, lowercase)
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Two-pointer check
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}