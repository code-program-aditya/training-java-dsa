import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double a=0;
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                a= Math.PI*r*r;
                break;
            case 2:
                a= l*b;
                break;
            default:
            System.out.println("area is: ");
                return;
        }
        System.out.println("area is: " + a);
    }
}
