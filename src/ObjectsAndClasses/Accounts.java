package ObjectsAndClasses;

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
