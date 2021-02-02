public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel < -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }


    public int fillToner(int amount){
        if(amount > 0 && amount <= 100){
            if(this.tonerLevel + amount > 100){
                return -1;
            }
            this.tonerLevel += amount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printing(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint = (pages/2) + (pages %2);
            System.out.println("Printing in Duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
