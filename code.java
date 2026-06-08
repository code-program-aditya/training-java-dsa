import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%4 == 0 && a%100 !=0 || a%400 == 0){
            System.out.println("Special Leap Year");
        }
        else {
            System.out.println("not Special Leap Year");
        }
        
    }
}
