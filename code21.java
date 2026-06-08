import java.util.HashMap;
import java.util.Scanner;

public class code21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        while (--t >= 0) {
            arr[t] = sc.nextInt();
            for (int i = 0; i < arr[t]; i++) {
                arr[t] += sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr[t]; i++) {
        }
        
    }
}
}