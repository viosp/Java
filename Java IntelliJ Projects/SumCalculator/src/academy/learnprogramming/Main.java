package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// creating and initializing the objects

//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add = " + calculator.getAdditionResult());
//        System.out.println("subtract = " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply = " + calculator.getMultiplicationResult());
//        System.out.println("divide " + calculator.getDivisionResult());

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " +person.getFullName());
        System.out.println("teen= " +person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " +person.getFullName());
        System.out.println("teen= " +person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= " +person.getFullName());
    }
}
