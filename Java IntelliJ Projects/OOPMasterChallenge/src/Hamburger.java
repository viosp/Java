public class Hamburger {
    private String breadRollType;
    private String meat;
    private int basePrice;

    private String name1;
    private int price1;

    private String name2;
    private int price2;

    private String name3;
    private int price3;

    private String name4;
    private int price4;


    public Hamburger(String breadRollType, String meat, int basePrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void firstAddition(String name, int price){
        this.name1 = name;
        this.price1 = price;
    }

    public void secondAddition(String name, int price){
        this.name2 = name;
        this.price2 = price;
    }

    public void thirdAddition(String name, int price){
        this.name3 = name;
        this.price3 = price;
    }

    public void fourthAddition(String name, int price){
        this.name4 = name;
        this.price4 = price;
    }

    public int customizeHamburger(){
        int finalPrice = this.basePrice;
        System.out.println("Your hamburger on a " +this.breadRollType+
                " with " +this.meat+ " , the price is " +this.basePrice);

        if(this.name1 != null){
            finalPrice += this.price1;
            System.out.println("Added " +this.name1+ " for an extra "
                    +this.price1);
        }
        if(this.name2 != null){
            finalPrice += this.price2;
            System.out.println("Added " +this.name2+ " for an extra "
                    +this.price2);
        }
        if(this.name3 != null){
            finalPrice += this.price3;
            System.out.println("Added " +this.name3+ " for an extra "
                    +this.price3);
        }
        if(this.name4 != null){
            finalPrice += this.price4;
            System.out.println("Added " +this.name4+ " for an extra "
                    +this.price4);
        }
        return finalPrice;
    }
}


