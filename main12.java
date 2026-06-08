public class main12 {
    public static void main(String[] args) {
        toaster t1 = new toaster();
        t1.turnOn();
    }
}
class Appliance{
    void turnOn(){
        System.out.println("appliance is turn on");
        System.out.println("appliance is turn on");
    }
}
class toaster extends Appliance{
    @Override
    void turnOn(){
        System.out.println(" turnon");
        
    }
}