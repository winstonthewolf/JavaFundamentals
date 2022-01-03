/*
*
*
* (Game: ATM machine) Use the Account class created in Programming Exer-
cise 9.7 to simulate an ATM machine. Create 10 accounts in an array with id 0 ,
1 , . . . , 9 , and an initial balance of $100. The system prompts the user to enter
an id. If the id is entered incorrectly, ask the user to enter a correct id. Once an
id is accepted, the main menu is displayed as shown in the sample run. You can
enter choice 1 for viewing the current balance, 2 for withdrawing money, 3 for
depositing money, and 4 for exiting the main menu. Once you exit, the system
will prompt for an id again. Thus, once the system starts, it will not stop.
* */


package ObjectOrientedThinking;

import ObjectsAndClasses.Account;

import java.util.Scanner;

public class Accounts {
    public static void main(String[] args) {

        Account[] storedAccounts = new Account[10];                 //Make 10 accounts each with 100$
        for (int i = 0; i < 10; i++) {
            storedAccounts[i] = new Account(i, 100);
        }
        Scanner input = new Scanner(System.in);


        int id;
        do {                                                        //Enter valid ID. ID is 0-9 using accounts array.
            System.out.println("Enter ID");
            id = input.nextInt();
        } while((id > storedAccounts.length) || (id < 0));
        

        int choice;

        while(true) {                                     //Menu populated and choice verification system. System breaks out of loop and ends when choice 3 is chosen

            printMenu();
            choice = input.nextInt();
            while (choice < 0 || choice > 3) {                  //If out of choice out of bounds retry until it is a valid number
                System.out.println("Enter valid option");
                choice = input.nextInt();
            }
            switch (choice) {                                   //Choices
                case 0 -> System.out.println("Current Balance: " + storedAccounts[id].getBalance());
                case 1 -> {
                    System.out.println("How much do you want to withdraw?");
                    System.out.println("Enter amount: ");
                    double amountWithdrawn = input.nextDouble();
                    storedAccounts[id].withdraw(amountWithdrawn);
                    System.out.println("SUCCESS");
                }
                case 2 -> {
                    System.out.println("How much to deposit? ");
                    System.out.println("Enter amount: ");
                    double amountDeposited = input.nextDouble();
                    storedAccounts[id].deposit(amountDeposited);
                    System.out.println("SUCCESS");
                }
                case 3 -> {
                    System.out.println("Goodbye");
                    System.exit(0);
                }
            }
        }


    }

    private static void  printMenu(){                                //Prints out menu

        System.out.println("*******Main menu********");
        System.out.println("0: Check balance");
        System.out.println("1: Withdraw");
        System.out.println("2: Deposit");
        System.out.println("3: exit");
        System.out.println("Enter a choice: ");

    }
}
