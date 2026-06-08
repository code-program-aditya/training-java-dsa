import java.util.List;
import java.util.stream.Collectors;

public class main29 {
    public static void main(String[] args) {
        //source data
        List<String> rawData = List.of("apple", "banana", "kiwi", "avocado");
        List<String> onlyAwords = rawData.stream()
        //inermediate operation
        .filter(word -> word.startsWith("a"))
        .collect(Collectors.toList());
        System.out.println("orignal list" + rawData);
        System.out.println("new list" + onlyAwords);
    }
}
