import java.util.LinkedList;
import java.util.Queue;

public class code39 {
    public static void main(String[] args) {
        Queue<Integer> s = new LinkedList<>();
        s.add(4);
        s.add(3);
        s.add(1);
        s.add(5);
        System.out.println(s);
        System.out.println(s.peek());
        s.poll();
        System.out.println(s);
        System.out.println(s.size());
    }
}
