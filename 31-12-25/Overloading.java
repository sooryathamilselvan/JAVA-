class Multiply {
    int product(int a, int b) {
        return a * b;
    }

    double product(double a, double b) {
        return a * b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Multiply m = new Multiply();
        System.out.println(m.product(4, 5));
        System.out.println(m.product(2.5, 3.5));
    }
}