package com.silviaspassov;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch(ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }
    }

    private static int divide(){
        int x, y;
//        try{
            x = getInt();
            y = getInt();
            System.out.println("x is " +x + " , y is " +y);
            return x/y;
//        } catch (NoSuchElementException e){
//            throw new ArithmeticException("no suitable input");
//        } catch(ArithmeticException e) {
//            throw new ArithmeticException("Attempt to divide by 0");
//        }
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter integer");
        while(true){
            try{
                return s.nextInt();
            } catch (InputMismatchException e){
                //go oround again - read past end of line in first input
                s.nextLine();
                System.out.println("please enter number 0-9");
            }
        }

    }
}
