public class HealthyBurger extends Hamburger {
    private String healthyname1;
    private int healthyprice1;

    private String healthyname2;
    private int healthyprice2;

    public HealthyBurger(String meat, int basePrice) {
        super("Brown Rye", meat, basePrice);
    }

    public void setHealthyname1(String name, int price) {
        this.healthyname1 = name;
        this.healthyprice1 = price;
    }

    public void setHealthyname2(String name, int price) {
        this.healthyname2 = name;
        this.healthyprice2 = price;
    }

    @Override
    public int customizeHamburger() {
        int finalPrice =  super.customizeHamburger();
        if(this.healthyname1 != null){
            finalPrice += this.healthyprice1;
            System.out.println("Added " +this.healthyname1+ " for an extra "
                    +this.healthyprice1);
        }
        if(this.healthyname2 != null){
            finalPrice += this.healthyprice2;
            System.out.println("Added " +this.healthyname2+ " for an extra "
                    +this.healthyprice2);
        }

        return finalPrice;
    }
}
