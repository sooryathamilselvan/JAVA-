// Interface definition
interface Animal {
    void sound();
}

// Implementation class
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof! Woof!");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}