class Person {
    String name;
    int age;
}

class Student extends Person {
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Soorya";
        s.age = 20;

        s.display();
    }
}
