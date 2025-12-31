class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager is managing the team");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();     // inherited method
        m.manage();   // own method
    }
}
