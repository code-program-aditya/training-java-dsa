import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main26 {
    public static void main(String[] args) {
        List<Students> students4 = new ArrayList<>();
        students4.add(new Students(1,50, "aditya"));
        System.out.println(students4);
        students4.add(new Students(5, 50,"raj"));
        System.out.println(students4);
    }
}
class Students{
    String Name;
    int id;
    int marks;
    public Students(int id, int marks, String Name){
        this.id = id;
        this.marks = marks;
        this.Name = Name;
    }
    @Override
    public String toString(){
        return id + " " + Name + " " + marks;
}
}
class MarksComparator implements Comparator<Students>{
    @Override
    public int compare(Students s1, Students s2){
        return s1.marks - s2.marks;
    }
}