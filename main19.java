import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class main19 {
    public static void main(String[] args) {
        List <Integer> num = new ArrayList<>();
        num.add(1);
        num.add(5);
        num.add(9);
        num.add(8);
        num.add(2);
        num.add(4);
        System.out.println(num);
        num.sort(null);
        Collections.sort(num);
        for (int l = 0; l<num.size();l++){
            System.out.println("the value at index i : " + num.get(l));
        }
        for (Integer nums : num){
            System.out.println("numbers: " + nums);
        }
    }
}
