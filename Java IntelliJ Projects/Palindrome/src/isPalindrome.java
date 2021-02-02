public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrom(-1221));

    }
    public static boolean isPalindrom(int number){
        int reverse =0;
        number = Math.abs(number);
        int temp = number;

        while(number > 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number/10;

        }
        if(temp==reverse){
            return true;
        }
        else
            { return false;
        }

    }

}
