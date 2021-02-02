package com.silviaspassov;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            transactions.add(amount);
            this.balance+= amount;
            System.out.println(amount  + " deposited. balance is now " + this.balance );
        } else {
            System.out.println("CANNOT deposit negative sums");
        }
    }

    public void withdraw(int amount){
        int withdrawal = -amount;
        if(withdrawal < 0 ){
            this.transactions.add(withdrawal);
            this.balance +=withdrawal;
            System.out.println(amount + "withdrawn. balance is now " +this.balance);
        } else {
            System.out.println("cannot withdeaw negative sums");
        }
    }

    public void calculateBalance(){
        this.balance = 0;
        for(int i : this.transactions){
            this.balance+=i;
        }
        System.out.println("calculated balance is " + this.balance);
    }
}
