import java.util.ArrayList;
import java.util.List;

public class main22 {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(7);
        l.add(8);
        l.add(6);
        l.add(5);
        l.add(3);
        List<Integer> m = new ArrayList<>();
        m.add(1);
        m.add(2);
        m.add(7);
        m.add(8);
        m.add(6);
        m.add(5);
        m.add(3);
        System.out.println("Does the list1 contains all elements of list2 is " + l.containsAll(m));
        System.out.println("the intersection of l and m is " + l.retainAll(m));
        System.out.println("The defference of l annd m is " + l.removeAll(m));
        ;
    }
}
