public class Main {
    public static void main(String[] args) {
        //creating the objects
//         bank bankAccount = new bank(12345, 1000d, "Silvia Spassov", "spassov0106@gmail.com", "7654324");
//
//        System.out.println("Account Number = "+bankAccount.getAccountNumber());
//        System.out.println("Balance = "+bankAccount.getBalance());
//        System.out.println("Customer "+bankAccount.getCustomerName());
//        System.out.println("Email = "+bankAccount.getEmail());
//        System.out.println("Phone Number = "+bankAccount.getPhoneNumber());
//
//        bankAccount.depositFunds(500);
//        bankAccount.withdrawFunds(1200);
//        bankAccount.withdrawFunds(400);

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 25000);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Tim", 1000, "spassov@email.com");
        System.out.println(customer3.getEmailAddress());
    }
}
