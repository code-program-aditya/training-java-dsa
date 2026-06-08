import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class main23 {
    public static void main(String[] args) {
        Map<Integer,String> Students = new HashMap<>();
        Students.put(16, "Dheeraj");
        Students.put(15, "aditya");
        Students.put(12, "priya");
        Students.put(10, "raj");
        Students.put(19, "rahul");
        System.out.println(Students);
        Students.put(11, "shivam");
        System.out.println(Students);
        System.out.println("the value at the 15th key is " +Students.get(15));
        // Iterating a map
        for (Map.Entry<Integer, String> map: Students.entrySet()){
            System.out.println("the key is " + map.getKey() + " and the value is " + map.getValue());
        }
        List<Integer> list1 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>(list1);
    }
}
