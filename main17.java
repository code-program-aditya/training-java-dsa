public class main17 {
    public static void main(String[] args) {
        Puppy p1 = new Puppy();
        p1.sound();
    }
}
interface Dog {
    void sound();
}
interface Cat{
    void sound();
}
class Puppy implements Cat,Dog{
    public void sound(){
        System.out.println("The Puppy woofs!!");
    }
}