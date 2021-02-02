package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //create the object and initialize it
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
