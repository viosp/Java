public class DaysInMonth {
    public static void main(String[] args) {
        getDaysInMonth(1,2020);
    }
        public static boolean isLeapYear(int year) {

            if(year <= 0 || year > 9999){
                return false;
            }

            else if(year % 4 != 0) {
                return false;}
            else if(year % 100 !=0){
                return true;}
            else if(year % 400 !=0) {
                return false;}
            else return true;
        }

        public static int getDaysInMonth(int month, int year){
            if(((month < 1) || (month > 12)) && ((year<1) || (year>9999))){
                return -1;
            }

            switch(month){
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                    System.out.println("31");
                    break;
                case 2:
                    if(isLeapYear(year)){
                        System.out.println("29");
                    }
                    else {
                        System.out.println("28");
                    }
                    break;
                case 4:case 6:case 9:case 11:
                    System.out.println("30");
                    break;
                default: return -1;
            }
            return -1;
            }


    }

