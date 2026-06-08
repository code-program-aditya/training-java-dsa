import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class main20 {
    public static void main(String[] args) {
        Set<String> cars1 = new HashSet<>();
        Set<String> cars2 = new TreeSet<>();
        cars1.add("maruti");
        cars1.add("kia");
        cars1.add("toyota");
        cars1.add("Maruti");
        cars1.add("kia");
        System.out.println(cars1);
        cars2.add("maruti");
        cars2.add("kia");
        cars2.add("Toyota");
        cars2.add("Maruti");
        cars2.add("kia");
        System.out.println(cars2);
        //2. check if a value is present in set
        if (cars1.contains("Maruti")) {
            System.out.println("Maruti is present");
        }
        if (cars1.contains("volvo")){
            System.out.println("volvo is present");
        }
        else {
            System.out.println("Volvo not present");
        }
        for(String c: cars1){
            System.out.println(c);
        }
        for(String f: cars2){
            System.out.println(f);
        }
        cars1.remove("Maruti");
        System.out.println(cars1);
    }
}
