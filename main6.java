public class main6 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eats();
    }
}
class Animal {
    void eats(){
        System.out.println("the animal eats food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("the Dog barks, woof");
    }
} // single inhe
