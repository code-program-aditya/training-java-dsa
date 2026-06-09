import java.util.Scanner;

public class code28 {
    public static void main(String[] args) {
        Scanner Var = new Scanner(System.in);
        String s = Var.next();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        int max = 0;
        char result = ' ';
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char) ('a' + i);
            }
        }
        System.out.println(result);
    }
}
