public class Calculator {
    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        double floorArea = floor.getArea();
        double carpetArea = carpet.getCost();

        return floorArea * carpetArea;
    }
}