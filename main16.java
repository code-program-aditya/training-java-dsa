public class main16 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.starts();
        c1.stop();
        Bike b1 = new Bike();
        b1.starts();
        b1.stop();
    }
}
interface Vehicle{
    void starts();
    void stop();
}
class Car implements Vehicle{
    public void starts(){
        System.out.println("The car starts");
    }
    public void stop(){
        System.out.println("the car stops");
    }
}
class Bike implements Vehicle{
    public void starts(){
        System.out.println("The car starts");
    }
    public void stop(){
        System.out.println("the car stops");
    }
}