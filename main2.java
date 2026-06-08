public class main2 {
    public static void main(String[] args) {
        Students Students1 = new Students();
        Students1.name = "soumil";
        Students1.rollno = 1;
        Students1.marks = 20;
        System.out.println(Students1.name);
        System.out.println(Students1.rollno);
        System.out.println(Students1.marks);
        Students Students2 = new Students();
        Students2.name = "aditya raj";
        Students2.rollno= 10;
        Students2.marks= 590;
        System.out.println(Students2.name);
        System.out.println(Students2.rollno);
        System.out.println(Students2.marks);
    }
}
class Students{
    String name;
    int rollno;
    int marks;
}
