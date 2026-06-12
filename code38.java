import java.util.Scanner;
import java.util.Stack;

public class code38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
            System.out.println(s);
        }
        while (!s.isEmpty()) {
            int temp = s.pop();
            System.out.println(temp);
        }
    }
}
