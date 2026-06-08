
import java.util.Scanner;

public class codechef11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a number: ");
        System.out.println("Enter b number: ");
        System.out.println("Enter c number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>=b && a>=c ) {
            System.out.println(" greater value " + a);
        } else if(b>=a && b>=c){
            System.out.println(" greater value " + b );
        } else {
            System.out.println(" greater value " + c );
        }
    }
}