/*
Using the two arrays shown below,
write a program that prompts the user to enter an integer between 1 and 12 and
then displays the months and its number of days corresponding to the integer
entered. Your program should display “wrong number” if the user enters a
wrong number by catching ArrayIndexOutOfBoundsException .
*/
package ExceptionHandlingAndTextIO;

import java.util.Scanner;

public class CalendarDays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer between 1 ans 12 to get the name of the month and number of days in month");
        int month = input.nextInt();
        try {
            getMonthAndDays(month);
        }catch(ArrayIndexOutOfBoundsException ex){

            System.out.println("Invalid month input. Choose a number between 1 and 12");
            System.exit(1);

        }
    }

    public static void getMonthAndDays(int month){


        String[] months ={"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Month: " + months[month - 1] + " Days: " + dom[month - 1]);
    }
}
