import java.util.Scanner;
public class codechef41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String u = sc.next();
        String result = u.toLowerCase().replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "").replace("y", "");
        for(int i =0; i<result.length(); i++){
            System.out.print("." + result.charAt(i));
        }
    }
}