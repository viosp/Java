import java.util.Scanner;

public class InputCalculator {

//        inputThenPrintSumAndAverage();
//        }
        public static void inputThenPrintSumAndAverage() {

            Scanner scanner = new Scanner(System.in);

            int sum = 0;
            int count = 0;
            double avg = 0;

            while (true) {
                

                boolean isAnInt = scanner.hasNextInt();

                if (isAnInt) {
                    int number = scanner.nextInt();
                    sum += number;
                    count++;
                    avg = (double) sum / (double) count;
                    avg = Math.round(avg);

                } else {
                    int avgInInt = (int) avg;
                    int intSum = (int) sum;
                    System.out.println("SUM = " + intSum + " AVG = " + avgInInt);
                    break;
                }
                scanner.nextLine();

            }

            scanner.close();

        }
    }

