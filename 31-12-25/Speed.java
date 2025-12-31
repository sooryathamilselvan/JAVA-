class Vehicle {
    void fuelType() {
        System.out.println("Vehicle uses petrol");
    }
}

class Bike extends Vehicle {
    void speed() {
        System.out.println("Bike speed is 80 km/hr");
    }
}

public class Speed {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.fuelType(); // inherited
        b.speed();    // subclass method
    }
}
