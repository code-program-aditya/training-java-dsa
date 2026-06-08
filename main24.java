import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main24 {
    public static void main(String[] args) {
        int count = 0;
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,1,1,1,5,6,2,4,4,2,3,5,6,7,8,9,1,4,5));
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i : list1){
            if(freqMap.containsKey(i)==true){
                int freqofKey = freqMap.get(i);
                freqMap.put(i, freqofKey+1);
            }
            else{
                freqMap.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            System.out.println(" key: " + entry.getKey() + " value: " + entry.getValue());
            count++;
        }
    }
}
