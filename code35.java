import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class code35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> St = new Stack<>();
        St.push(10);
        St.push(20);
        St.push(30);
        St.push(40);
        St.pop();
        System.out.println(St);
        System.out.println(St.peek());
    }
}
