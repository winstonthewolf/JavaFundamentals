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

    Account(){

    }

    Account(int id, double balance){
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
