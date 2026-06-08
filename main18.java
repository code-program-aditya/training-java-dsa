import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> codeingLangauages = new ArrayList<>();
        //1.
        codeingLangauages.add("java");
        codeingLangauages.add("python");
        codeingLangauages.add("C++");
        codeingLangauages.add("javaScript");
        //2. Add at a specific index
        codeingLangauages.add(1, "rust");
        codeingLangauages.add(3, "Go");
        System.out.println(codeingLangauages);
        //3. Acess and update
        System.out.println("the value at 2nd index is " + codeingLangauages.get(2));
        codeingLangauages.set(2, "Anaconda");
        //4. remove element
        codeingLangauages.remove(2);
        System.out.println(codeingLangauages);
        //5. sort list
        Collections.sort(codeingLangauages);
        System.out.println(codeingLangauages);
        // collection.sort(codeingLanguages);
        codeingLangauages.sort(null);
        System.out.println(codeingLangauages);
        System.out.println("the size of yhe arraylist is " + codeingLangauages.size());
        // for - each
        for(String s: codeingLangauages){
            System.out.println("language: " + s);
        }
    }
}