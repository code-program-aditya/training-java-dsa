public class main7 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eats();
        puppy p1 = new puppy();
        p1.bark();
        p1.Cute();
        p1.eats();
        Cat c1 = new Cat();
        c1.eats();
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
}
class puppy extends Dog {
    void Cute (){
        System.out.println("The puppy is cute");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("The main meows!!");
    }
} //hierarchial inheritance