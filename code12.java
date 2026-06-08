public class code12 {
    public static void main(String[] args) {
    int[]arr ={99,2,3,4};
    int[] feq = new int[100];
    for (int num : arr){
        feq[num]++;
    }
    System.out.println("Element\tFrequency" + feq.length);
    for (int i = 0; i < feq.length; i++){
        System.out.println(i + "\t" + feq[i]);
    }
    }
}