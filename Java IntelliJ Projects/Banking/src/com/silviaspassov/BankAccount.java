package com.silviaspassov;

public class BankAccount {

    private String firstName;
    private  String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }
    //branch is true, if customer is performing transaction at a branch with a teller
    //false if customer is performing transaction at atm
    public double deposit(double amount, boolean branch){
        balance +=amount;
        return balance;
    }

    public double withdraw(double amount, boolean branch){
        if((amount > 500) & (!branch)){
            throw new IllegalArgumentException();
        }

        balance-=amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking(){
        return accountType == CHECKING;
    }
}
