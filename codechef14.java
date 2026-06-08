
import java.util.Scanner;

public class codechef14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3 == 0 && a%5 == 0) {
            System.out.println("fizzbuzz");
        } else if(a%3 == 0) {
            System.out.println("fizz");
        } else if(a%5 == 0) {
            System.out.println("buzz");
        }
        else {
            System.out.println("otherwise print numbers");
        }
        }
        }

