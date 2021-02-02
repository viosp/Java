public class Vehicle {

    private String name;
    private String size;
    private String color;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection +=direction;
        System.out.println("Vehicle.Steer(): Steering at " + currentDirection + "degrees.");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " +currentVelocity + "int direction " +currentDirection);

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }

}











