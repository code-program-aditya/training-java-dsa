
import java.text.DecimalFormat;
import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.print(df.format(a/b));
    }
}
