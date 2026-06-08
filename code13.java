import java.util.*;

public class code13 {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> leaders = new ArrayList<>();

        int n = arr.length;
        int maxFromRight = arr[n-1];  // last element is always a leader
        leaders.add(maxFromRight);

        // Traverse from right to left
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        // Reverse to maintain original order
        Collections.reverse(leaders);
        System.out.println(leaders);
    }
}
