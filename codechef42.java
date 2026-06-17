import java.util.Scanner;

public class codechef42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxLen = 1;
        int curLen = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                curLen++;
            } else {
                if (curLen > maxLen) {
                    maxLen = curLen;
                }
                curLen = 1;
            }
        }
        if (curLen > maxLen) {
            maxLen = curLen;
        }
        System.out.println(maxLen);
    }
}
