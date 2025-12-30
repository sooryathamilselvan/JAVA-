// Interface
interface Test {
    void meth1();
    void meth2();
}
// Class implementing interface
class My implements Test {
    public void meth1() {
        System.out.println("Meth1 of class My");
    }

    public void meth2() {
        System.out.println("Meth2 of class My");
    }
}
// Main class
public class Main {
    public static void main(String[] args) {
        // Interface reference, class object
        Test t = new My();
        t.meth1();
        t.meth2();
        System.out.println("--");
    }
}