public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,  false);

        System.out.println("Initial page count = " +printer.getPagesPrinted());

        int pagesPrinted = printer.printing(4);
        System.out.println("Pages printed was " +pagesPrinted + " new total count for printer = " +printer.getPagesPrinted());

        pagesPrinted = printer.printing(2);
        System.out.println("Pages printed was " +pagesPrinted + " new total count for printer = " +printer.getPagesPrinted());

    }
}
