public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Im not very good at that, can I swim instead?");
    }
}
