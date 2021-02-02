public class bank {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public bank(){
        this(56789, 2.5, "default name", "default email", "default phone");
        System.out.println("Empty constructor called");
    }

    public bank(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFunds(double depFunds){
        balance += depFunds;
        System.out.println("balance = "+balance);
    }


    public void withdrawFunds(double withFunds){

        if (balance >= withFunds) {
            balance -= withFunds;
            System.out.println("balance = " + balance);
        }
        else {
            System.out.println("Not possible");
        }
    }


}
