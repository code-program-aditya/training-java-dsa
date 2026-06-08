public class main14 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        Cat c =new Cat();
        c.sound();
    }
}
abstract class Animal {
    abstract void sound();
    public void sleep(){
        System.out.println("the animal sleeps");
    }
}
class Dog extends Animal{
    @Override
    void sound (){
        System.out.println("The dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound (){
        System.out.println("the cat meow");
    }
}