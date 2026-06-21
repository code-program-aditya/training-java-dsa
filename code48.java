import java.util.Scanner;

public class code48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        float b = scanner.nextFloat();
        double c = scanner.nextDouble();
        long l = scanner.nextLong();
        byte d = scanner.nextByte();
        double p = c/b;
        double q = b/a;
        double r = c/a;
        double m = (c/a) + l;
        int s = a/d;
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
    }
}
