import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=1; i<=a; i++){
            arr[i] = sc.nextInt();
            System.out.println(i);
            try{
                short c = sc.nextShort();
                long f = sc.nextLong();
                byte g = sc.nextByte();
                int o = sc.nextInt();
                System.out.println("n can be fitted in: * dataType" + c );
            }
            catch(Exception e){

            }
        }
    }
}
