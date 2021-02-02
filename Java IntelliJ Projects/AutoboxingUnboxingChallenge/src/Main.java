public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Poalim");
        bank.addBranch("BatYam");
        bank.addCustomer("BatYam", "Silvia", 50.5);
        bank.addCustomer("BatYam", "Yoan", 100.58);
        bank.addCustomer("BatYam", "Dean", 250.12);

        bank.addBranch("TelAviv");
        bank.addCustomer("TelAviv", "Bob", 450.76);

        bank.addCustomerTransaction("BatYam", "Silvia", 10.4);
        bank.addCustomerTransaction("BatYam", "Tim", 45.4);
        bank.addCustomerTransaction("BatYam", "Silvia", 200.8);

        bank.listCustomers("BatYam", true);



    }
}
