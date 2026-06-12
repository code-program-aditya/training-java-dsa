import java.util.Scanner;
import java.util.Stack;

public class code37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> g = new Stack<>();
        g.add(5);
        g.add(8);
        g.add(6);
        g.add(7);
        g.add(9);
        g.add(2);
        g.pop();
        g.pop();
        g.add(0,1);
        g.add(3, 10);
        System.out.println(g);
    }
}
