public class code9 {
    public static void main(String[] args) {
        boolean result = checkNumber();
        System.out.println(result);
    }

    public static boolean checkNumber() {
        int[] number = { 10, 80, 40, 70, 50 };
        for (int i = 1; i < number.length; i++) {
            if (number[i] > number[i - 1]) {
                return true;
            }
        }
        return false;
    }
}