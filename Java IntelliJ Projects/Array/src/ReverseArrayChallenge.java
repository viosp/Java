import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));

        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length-1;
        int halfLength = array.length/2;

        for(int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;

        }

    }
}

