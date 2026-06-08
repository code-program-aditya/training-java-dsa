import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code10 {
    public static void main(String[] args) {
        int[] number = { 10, 80, 70, 70, 50, 80, 70, 50 };
        Arrays.sort(number);
        System.out.println("Sorted array: " + Arrays.toString(number));
        List<Integer> list = new ArrayList<>(number.length);
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (i == 0 || number[i] > number[i - 1]) {
                list.add(number[i]);
            } else if (number[i] == number[i - 1]) {
                System.out.println("Duplicate element: " + number[i]);
                count++;
            }
        }
        System.out.println("Unique elements: " + list);
    }
}
