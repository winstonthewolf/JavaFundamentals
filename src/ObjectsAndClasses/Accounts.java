package ObjectsAndClasses;

import java.util.Scanner;

public class Accounts {
    public static void main(String[] args) {

        Account [] storedAccounts = new Account[10];
        for(int i = 0; i<10; i++){
            storedAccounts[i] =new Account(i,100);
        }
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        if ((id < storedAccounts.length )&& (id >= -1) ){
           System.out.println("Main menu");
           System.out.println("0: Check balance");
           System.out.println("1: Withdraw");
           System.out.println("2: Deposit");
           System.out.println("3: exit");
           System.out.println("Enter a choice: ");

           ///TODO Make above if statement to while loop and put the printed statements in a method

           switch(id){

               case 1: System.out.println("Current Balance: "+ storedAccounts[id].getBalance());

               case 2: System.out.println("How much do you want to withdraw?");
                        System.out.println("Enter amount: ");
                        double amountWithdrawn = input.nextDouble();
                        storedAccounts[id].withdraw(amountWithdrawn);
                        System.out.println("SUCCESS");

               case 3: System.out.println("How much to deposit? ");
                        System.out.println("Enter amount: ");
                        double amountDeposited = input.nextDouble();
                        storedAccounts[id].deposit(amountDeposited);
                        System.out.println("SUCCESS");

               case 4: System.out.println("Goodbye");


           }

        }




//        /if((input.nextInt()< storedAccounts.length) && input.nextInt() >= 0){

//        /i
        //TODO method getID == id to retrieve account menu
    }
}
