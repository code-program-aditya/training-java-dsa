import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class code46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int s = scanner.nextInt();
        int[] d = new int[r];
        int[] f = new int[s];
        for (int i = 0; i < r; i++){
            d[i] = scanner.nextInt();
        }
        for (int i = 0; i < s; i++){
            f[i] = scanner.nextInt();
        }
        ArrayList<Integer> result = commonElements(d, f);
        System.out.println(result);
    }
    public static ArrayList<Integer> commonElements(int a[], int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> n = new HashMap<>();
        for (int num : a) {
            n.put(num, n.getOrDefault(num, 0) + 1);
        }
        for (int j : b) {
            if (n.getOrDefault(j, 0) > 0) {
                result.add(j);
                n.put(j, n.get(j) - 1);
            }
        }
        return result;
    }

}
