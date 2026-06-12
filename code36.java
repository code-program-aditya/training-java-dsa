import java.util.Scanner;
import java.util.Stack;

public class code36 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack<String> n = new Stack<>();
        n.push("aditya");
        n.push("rahul");
        n.push("pushpa");
        n.push("dharmraj");
        n.pop();
        n.add("arun");
        System.out.println(n);
        System.out.println(n.peek());
    }
}
