import java.util.ArrayList;
import java.util.Scanner;

public class code40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int m = 8;
        ArrayList<Integer>[] arr = new ArrayList[n+1];
        for (int i =0; i<=n; i++){
            arr[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<m; i++){
            int u,v;
            u= sc.nextInt();
            v= sc.nextInt();
            arr[u].add(v);
            arr[v].add(u);
        }
        sc.close();
        for(int i=0;i<=n; i++){
            for(int z: arr[i]){
                System.out.print(z);
            }
            System.out.println();
        }
    }
}
