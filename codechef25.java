public class codechef25 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int max=arr[0];
        int low=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<low){
                low=arr[i];
            }
        }
        System.out.printf("the max element is: %d", max);
        System.out.printf("the min element is: %d", low);
    }
}
