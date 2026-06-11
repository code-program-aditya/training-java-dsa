import java.util.LinkedList;

public class code34 {
    public static void main(String[] args) {
        LinkedList<Integer> n = new LinkedList<>();
        n.add(5);
        n.add(3);
        n.add(4);
        n.add(1);
        n.set(2, 6);
        n.remove(1);
        System.out.println(n.get(0));
}
}