package relationship;

public class Dog extends Animal{

    @Override
    void eat(){
        System.out.println("eat dog food.");
    }

    @Override
    void speak(){
        System.out.println("bark.");
    }
    void play(){
        System.out.println("jump");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.speak();
        animal.eat();
    }
}
