import java.util.Scanner;

public class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] getIntegers = readIntegers(5);
        int min = findMin(getIntegers);
        System.out.println(+min);


    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Enter " +count+ " integer values");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            int value = array[i];
            if(value < min){
                min = value;
            }
        }
        return min;

    }
}
