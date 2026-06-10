import java.util.ArrayList;
import java.util.Scanner;

public class code33 {
    public static void helper(int i, int n, int arr[], ArrayList<Integer> temp) {
        if (i >= n) {
            for (int z : temp) {
                System.out.print(z + " ");
            }
            System.out.println();
            return;
        }
        // take
        temp.add(arr[i]);
        helper(i + 1, n, arr, temp);
        // backtrack
        temp.remove(temp.size() - 1);
        // not take
        helper(i + 1, n, arr, temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> temp = new ArrayList<>();
        helper(0, n, arr, temp);
    }
}
