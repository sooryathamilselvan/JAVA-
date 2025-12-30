interface Shape {
    void displayAreaFormula();
    void area();
}

class Rectangle implements Shape {
    int length = 10;
    int breadth = 5;

    @Override
    public void displayAreaFormula() {
        System.out.println("Area of Rectangle = length * breadth");
    }

    @Override
    public void area() {
        System.out.println("Area = " + (length * breadth));
    }
}

class Circle implements Shape {
    double radius = 7;

    @Override
    public void displayAreaFormula() {
        System.out.println("Area of Circle = π * r * r");
    }

    @Override
    public void area() {
        System.out.println("Area = " + (Math.PI * radius * radius));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Shape s;   // Interface reference

        s = new Rectangle();
        s.displayAreaFormula();
        s.area();

        System.out.println();

        s = new Circle();
        s.displayAreaFormula();
        s.area();
    }
}
