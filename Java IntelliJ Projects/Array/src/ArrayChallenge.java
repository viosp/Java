import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers (int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " +capacity+ " integer values");
        for(int i=0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray (int[] array) {
        for(int i=0; i < array.length; i++){
            System.out.println("Element " + i+ " contents " +array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i < array.length; i++){
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);  //practical addition Java-built in

        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            //element o = 50;
            //element 1 = 160;
            //element 2 = 40
//            if(sortedArray[0] # 50 # < sortedArray[i+1 = 1]  # 160 #){
//                temp = sortedArray[i];   temp = 50
//                sortedArray[i] = sortedArray[i+1];   element [0] = 160
//                sortedArray[i+1] = temp;        element [1] = 50 //swapping
//                flag = true;

            for(int i=0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;

                }
            }
        }
        return sortedArray;
    }

}





