public class Main {
    public static void main(String[] args) {

//        int switchValue =4;
//
//        switch(switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3:case 4 :case 5:
//                System.out.println("was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " +switchValue);
//                break;
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }
//        //More code here
//    }
        char switchValue = 'A';

        switch (switchValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D':
                System.out.println("D was found");
                break;
            case 'E':
                System.out.println("E eas found");
                break;
//            case 'C': case 'D': case 'E':
//                System.out.println(+switchValue + "was found");
//                break;
            default:
                System.out.println("Not found");
                break;



        }

        String month = "jaNUary";

        switch(month.toLowerCase()){
            //for upper case + lower case
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
