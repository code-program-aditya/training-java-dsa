public class main15 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        Rectangle r = new Rectangle();
        r.area();

    }
}
abstract class shape{
    abstract void area();
}
class Circle extends shape{
    int radius = 5;
    @Override
    void area(){
        double result = 3.14 *radius*radius;
        System.out.println("the area of the circle is " + result);
    }
}
class Rectangle extends shape{
    int length = 4;
    int breadth = 5;
    @Override
    void area(){
        int result = length * breadth;
        System.out.println("the result of the rectangle is " +result);
    }
}