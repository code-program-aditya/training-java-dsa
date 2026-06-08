public class vehicle {
    public static void main(String[] args) {
        car a1 = new car();
        //a1.brake();
        //a1.run();
        a1.display();
    }
}

class information{
    int wheels;
    int color;
    int engine;
    information(){
    
    }
    void run(){
        System.out.println("running");
    }
    void brake(){
        System.out.println("applied the brakes for a vehicle");
    }
    void display(){
        System.out.println("car it is");
    }

    public int getWheels() {
        return wheels;
    }

    public int getColor() {
        return color;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
}
    class car extends information {
        car() {
        super();
        }
    void display() {
        super.brake();
        super.run();
        System.out.println("car it is");
    }
    }
    class scooty extends information {

    }


