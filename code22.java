import java.util.Scanner;

public class code22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        int[] pref = new int[t];
        pref[0] = arr[0];
        for(int i = 1; i < t; i++) {
            pref[i] = pref[i-1] + arr[i];
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            l-=1; 
            r-=1; 
            int sum = pref[r] ;
            if (l > 0) {
                sum -= pref[l-1];
            }
            System.out.println(sum);
        }
    }
}