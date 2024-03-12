interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}

public class Main2c {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        car.start();
        car.stop();

        motorcycle.start();
        motorcycle.stop();
    }
}