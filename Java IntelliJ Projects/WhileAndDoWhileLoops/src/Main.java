public class Main {
    public static void main(String[] args) {

        //while loop
        int count = 1;
        while(count !=6){
            System.out.println("Count value is " +count);
            count++;
        }

        //for loop
        for(int i=1; i!=6; i++){
            System.out.println("Count value is " +i);
        }

        //do while loop --- the do while loops always executes at least once
        count=1;
        do {
            System.out.println("Count value is " +count);
            count++;

            //you can add other rules such as
            if(count >100){
                break;
            }
        } while (count!=6);

        // print positive numbers - example
        int number =4;
        int finishNumber = 22;
        int evenNumbersFound = 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue; //continues loop without processing further loop code below,
                          // re-starts while loop
            }
            evenNumbersFound++;

            System.out.println("even number " + number);
        }

        System.out.println("Total even numbers found " +evenNumbersFound);

        }

        //challenge
    public static boolean isEvenNumber(int number){

        //with if statement
        if(number % 2 ==0){
            return true;
        }
        return false;



    }
}
