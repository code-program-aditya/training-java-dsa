public class code11 {
    public static void main(String[] args) {
        int[] arr = { 2,3,3,2,5,1,4};
        int count = 0;
        for (int i = 0;i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]&& i != j) {
                    count++;
                }
            }
        }
        System.out.println("Total duplicate elements: " + count);
    }
}