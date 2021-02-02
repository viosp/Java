public class Main {
    public static void main(String[] args) {
        double answer = calcFeetAndInchesToCentimeters(-10, 1);
        System.out.println(+answer );
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if( feet < 0 ||  inches < 0 || inches >12) {
            return -1;
        }


        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double feetToInch = feet * 12 + inches;
            double inchToCentimeter = feetToInch * 2.54;
            return inchToCentimeter;
        }
        return -1;
        }

    public static double calcFeetAndInchesToCentimeters (double inches){
        if(inches >=0) {
            double feetToInches = inches * 2.54;
            return feetToInches;
        }
        return -1;
        }
    }







