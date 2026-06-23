import java.util.Scanner;

public class code51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        int result = 0;
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }
        float s = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            s = (float) result / arr[i];
        }
        System.out.println(s);
    }
}
