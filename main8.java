

public class main8 {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.display();
    }
}
class shape {
    String Color ="red";
}
class circle extends shape{
    String Color ="blue";
    void display(){
    System.out.println("the color of circle is " + Color);
    System.out.println("the color of shape is " + super.Color);
}
}
