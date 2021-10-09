/*(Execution time) Write a program that creates an array of numbers from 1 to
        100,000,000 in ascending order. Display the execution time of invoking the
        linearSearch method and the binarySearch method in Listings 7.6 and
        7.7 respectively. Display the execution time of invoking both searches for the fol-
        lowing numbers: 1; 25,000,000; 50,000,000; 75,000,000; 100,000,000. You can
        use the following code template to obtain the execution time:
        long startTime = System.nanoTime();
        perform the task;
        long endTime = System.nanoTime();
        long executionTime = endTime − startTime;*/
import java.util.*;
import java.util.concurrent.TimeUnit;

public class ExecutionTime {

    public static void main(String [] args){
        int [] array = new int[100000000];
        for(int i = 0; i < 100000000; i++){
            array[i] = i + 1;
        }


        System.out.println("Execution Time for Binary Search for number '1': +"+getExecutionTimeBinary(array, 1) + " nanoseconds");
        System.out.println("Execution Time for Binary Search for number '25000000': +"+getExecutionTimeBinary(array, 25000000)+ " nanoseconds");
        System.out.println("Execution Time for Binary Search for number '50,000,000': +"+getExecutionTimeBinary(array, 50000000)+ " nanoseconds");
        System.out.println("Execution Time for Binary Search for number '75,000,000': +"+getExecutionTimeBinary(array, 75000000)+ " nanoseconds");
        System.out.println("Execution Time for Binary Search for number '100,000,000': +"+getExecutionTimeBinary(array, 100000000)+ " nanoseconds");

        System.out.println();
        System.out.println("Execution Time for Linear Search for number '1': +"+getExecutionTimeLinear(array, 1)+ " nanoseconds");
        System.out.println("Execution Time for Linear Search for number '25000000': +"+getExecutionTimeLinear(array, 25000000)+ " nanoseconds");
        System.out.println("Execution Time for Linear Search for number '50,000,000': +"+getExecutionTimeLinear(array, 50000000)+ "  nanoseconds");
        System.out.println("Execution Time for Linear Search for number '75,000,000': +"+getExecutionTimeLinear(array, 75000000)+ " nanoseconds");
        System.out.println("Execution Time for Linear Search for number '100,000,000': +"+getExecutionTimeLinear(array, 100000000)+ " nanoseconds");


    }

    public static long getExecutionTimeBinary(int [] array, int key ){
        long startTime = System.nanoTime();
        Arrays.binarySearch(array, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        return executionTime;
    }

    public static long getExecutionTimeLinear(int [] array, int key ){
        long startTime = System.nanoTime();
        linearSearch(array, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        return executionTime;
    }




    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
            }
        return -1;
    }
}
