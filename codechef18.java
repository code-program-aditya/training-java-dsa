import java.util.Scanner;

public class codechef18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        while (num != 0 && num > 0) {

            if (num % 2 == 0) {
                num /= 2;
            } 
            else {
                num--;
            }

            count++;
        }

        System.out.println(count);
    }
}