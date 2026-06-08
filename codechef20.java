
import java.util.Scanner;

public class codechef20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rever=0;
        int num=sc.nextInt();
        while(num>0){
            rever=rever*10+num%10;
            num/=10;
        }
        System.out.println(rever);
    }
}
