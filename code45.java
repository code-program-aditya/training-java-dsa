import java.util.Scanner;

public class code45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i =1; i<=n; i++){
            for(int j=1; j<=i;j++){
                if ((i == n || j == 0 || j == i)) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}