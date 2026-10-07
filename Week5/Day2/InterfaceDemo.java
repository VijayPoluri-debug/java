interface Vehicle {

    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();
    }
}