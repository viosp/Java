public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(){
        super("Tahini Roll", "Sausage", 20);
        super.firstAddition("Chips", 3);
        super.secondAddition("Drink", 2);
    }

    @Override
    public void firstAddition(String name, int price) {
        System.out.println("Deluxe addition - no additions allowed");
    }

    @Override
    public void secondAddition(String name, int price) {
        System.out.println("Deluxe addition - no additions allowed");
    }

    @Override
    public void thirdAddition(String name, int price) {
        System.out.println("Deluxe addition - no additions allowed");
    }

    @Override
    public void fourthAddition(String name, int price) {
        System.out.println("Deluxe addition - no additions allowed");
    }
}
