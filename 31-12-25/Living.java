class LivingBeing {
    void breathe() {
        System.out.println("Living beings breathe");
    }
}

class Human extends LivingBeing {
    void think() {
        System.out.println("Humans can think");
    }
}

class Teacher extends Human {
    void teach() {
        System.out.println("Teacher teaches students");
    }
}

public class Living {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.breathe();  // from LivingBeing
        t.think();    // from Human
        t.teach();    // from Teacher
    }
}
