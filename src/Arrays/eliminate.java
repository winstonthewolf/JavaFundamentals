/*
(Eliminate duplicates)
        Write a method that returns a new array by eliminating the
        duplicate values in the array using the following method header:

        public static int[] eliminateDuplicates(int[] list)

        Write a test program that reads in 10 integers, invokes the method, and displays
        the distinct numbers separated by exactly one space. Here is a sample run of the
        program:
        Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2
        The distinct numbers are: 1 2 3 6 4 5   */


import java.util.Arrays;
import java.util.Scanner;

public class eliminate {

    public static int[]  eliminateDuplicates(int[] list){

       // int [] arr; //array to hold list without duplicates

        //PSUEDO CODE
        //count how many unique numbers there are in the original array: iterate and compare arr[i] to entire array arr[j] if != to any ++
        //initialize an array of that size
        //fill with only unique values
        //can search across array for current value being iterated for duplicates
        //can search linearly,(can use any search algo?)  can keep track of how many with a count variable. If more than 1  then value is not unique
        // two different count variables. one for uniqueness and one to keep track of how many unique numbers there are
        // if using  a binary search the array needs to be in order

        int totalUnique = list.length; //assume all elements in list are unique
        for(int i=0; i < list.length; i++){
            int numOccurrance = 1;
            for(int j = i+1; j < list.length; j++){
                if(list[i] ==  list[j]){    // counting unique values to initialize a new all-unique array of the right size
                    numOccurrance++;
                    break;
                }

            }
            totalUnique = totalUnique - (numOccurrance-1);//subtract amount of times the same num occurred if more than 1. Gets total amount of unique nums so far.
        }

        int []  uniqueArr = new int[totalUnique]; // creates a new array with the exact number of unique values calculated previously

        int uniqueArrIndex = 0 ;
        for(int i=0; i < list.length; i++){                 //Compares each original array element to all elements in the unique-only array. If it's a duplicate
            boolean isDuplicate = false;                    // it sets a flag.
            for(int j = 0; j < uniqueArr.length; j++){
                if(list[i] ==  uniqueArr[j] ) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){                          //If at the end of the comparison for each element the duplicate flag is not set, insert the unique element into the unique-only array
                uniqueArr[uniqueArrIndex]=list[i];     // and increase the counter for the current position of the uniqueArray where a new element will be placed.
                uniqueArrIndex++;
            }
        }

        return uniqueArr;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int [] array = new int[10];
        System.out.println("Enter 10 numbers: ");

        for(int i =0; i < array.length; i++ ){
            array[i] = input.nextInt();
        }
        int [] newArray;
        newArray = eliminateDuplicates(array);
        System.out.println(Arrays.toString(newArray));
    }
}
