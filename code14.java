import java.util.HashMap;

public class code14 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,1,4,2};
        int count = 0;
        HashMap<Integer, String> map = new HashMap<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], "Value for " + arr[i]);
            count++;
        }
        System.out.println("Count: " + count + ", Map Size: " + map.size());
    }
}
