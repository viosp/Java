import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);

        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
//        for(int i =0; i<=10; i++){
//            intArrayList.add(Integer.valueOf(i));   //autoboxing
//        }
//
//        for(int i =0; i<=10; i++){
//            System.out.println(i + " --> " +intArrayList.get(i).intValue()); //unboxing
//        }

        //short way of doing it

        Integer myIntValue = 56; // java compiles it like this -> Integer.valueOf(56);
        int myInt = myIntValue; //java is doing this ->  myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl < 10.0; dbl+=0.5){
            //autoboxing -- converting primitive double to object
            myDoubleValues.add(dbl);
        }
        //unboxing - converting from object back to primitive type double
        for(int i=0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(i + " ---> " +value);
        }



    }
}
