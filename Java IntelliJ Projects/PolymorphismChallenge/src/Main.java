class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Engine Starting...";
    }

    public String accelerate() {
        return "Accelerating...";
    }

    public String brake() {
        return "Braking...";
    }

}

class Ford extends Car {
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Engine has started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking";
    }
}

class Honda extends Car {
    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Engine has started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking";
    }
}

class Hyundai extends Car {
    public Hyundai(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Engine has started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking";
    }
}



public class Main {
    public static void main(String[] args) {

        Car car = new Car("Base",3);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Honda honda = new Honda("555XX", 4);
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());


    }
}
