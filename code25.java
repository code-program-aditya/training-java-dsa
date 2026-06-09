import java.util.Scanner;

public class code25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String v: vowels){
            if (s.contains(v)){
                count++;
            }
        }
        System.out.println("number vowel word" + count);
    }
}
