public class Main {
    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest =" + calculateInterest(10000, 2.0));

        for(int i=8; i>1; i--){
            System.out.println("10,000 at " +i +" % interest =" + calculateInterest(10000, i));
        }
         int count =0;
        for(int i=10; i<50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("number " +i+ " is a prime number");
                if(count==10){
                    System.out.println("existing for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i <= (long) Math.sqrt(n); i++){
            if(n% i==0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {

            return ((amount * interestRate) / 100);
        }

}
