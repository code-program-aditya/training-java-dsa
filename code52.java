import java.util.Scanner;

public class code52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int[] arr = new int[d];
        for (int i = 0; i < d; i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.println(average(arr));
    }
    public static String average(int arr[]){
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double avg = (double)sum/arr.length;
        return String.format("%.2f", avg);
    }
}
