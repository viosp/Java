public class Main {
    public static void main(String[] args) {
        ITelephone tims;
        tims = new DeskPhone(123456);
        tims.powerOn();
        tims.callPhone(123456);
        tims.answer();

        tims = new MobilePhone(246565);
        tims.powerOn();
        tims.callPhone(246565);
        tims.answer();

    }
}
