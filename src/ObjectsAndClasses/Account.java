/*
*
* (The Account class) Design a class named Account that contains:
■ ■
■ ■
A private int data field named id for the account (default 0 ).
A private double data field named balance for the account (default 0 ).386 Chapter 9   Objects and Classes
A private double data field named annualInterestRate that stores the cur-
rent interest rate (default 0 ). Assume that all accounts have the same interest rate.
A private Date data field named dateCreated that stores the date when the
account was created.
A no-arg constructor that creates a default account.
A constructor that creates an account with the specified id and initial balance.
The accessor and mutator methods for id , balance , and annualInterestRate .
The accessor method for dateCreated .
A method named getMonthlyInterestRate() that returns the monthly
interest rate.
A method named getMonthlyInterest() that returns the monthly interest.
A method named withdraw that withdraws a specified amount from the
account.
A method named deposit that deposits a specified amount to the account.
*        Draw the UML diagram for the class then implement the class. (Hint: The method
getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate . monthlyInteres-
tRate is annualInterestRate / 12 . Note annualInterestRate is a per-
centage, for example 4.5%. You need to divide it by 100.)
*
* */


package ObjectsAndClasses;

import java.util.Date;

public class Account {


    public static void main(String [] args){

        Account account_01 = new Account(1122,20000);
        account_01.setAnnualInterestRate(4.5);
        account_01.withdraw(2500);
        account_01.deposit(3000);
        System.out.println("Balance: "+ account_01.getBalance());
        System.out.println("Monthly Interest: "+ account_01.getMonthlyInterest());
        System.out.println(account_01.getDateCreated());
    }
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){

    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double rate){
        this.annualInterestRate = rate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
       return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

}
