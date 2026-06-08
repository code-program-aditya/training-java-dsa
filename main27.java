import java.util.List;

public class main27 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 8, 20);
        System.out.println("Starting the pipeline...");
        numbers.stream()
        .filter(num -> num > 10)
        .forEach(winner -> System.out.println("Winner: " + winner));
    }
}