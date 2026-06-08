import java.util.Arrays;
import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean result = validAnagram(a, b);
        System.out.println("Are they anagrams? " + result);
    }

    public static boolean validAnagram(String a, String b){
        if (a.length() != b.length()){
            return false;
        }
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for (int i = 0; i < arrA.length; i++) {
        if (arrA[i] != arrB[i]) {
        return false;
        }
    }
return true;
}
}