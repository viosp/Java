public class Main {
    public static void main(String[] args) {
        sumDigits(9);
    }
    public static int sumDigits(int number){
        if(number >=10){
            int one = number/100;
            int middle = number / 10;
            int middlex = middle % 10;
            int last = number % 10;
            int sum = one + middlex + last;
            System.out.println(+sum);
        }
        return -1;
    }
}
