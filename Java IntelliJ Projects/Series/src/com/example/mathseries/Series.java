package com.example.mathseries;

public class Series {

    public static int nSum(int n){
        return (n*(n+1) /2);
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *=i;
        }
        return fact;

    }

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        } else if(n==1){
            return 1;
        }
        int nMinus1 = 1;
        int nMinus2 = 0;
        int fib  = 0;
        for(int i=1; i<n; i++){
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }
}
