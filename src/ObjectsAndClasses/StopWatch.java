import java.util.Random;

import static java.lang.System.currentTimeMillis;

/*
(Stopwatch) Design a class named StopWatch . The class contains:

Private data fields startTime and endTime with getter methods.
A no-arg constructor that initializes startTime with the current time.
A method named start() that resets the startTime to the current time.
A method named stop() that sets the endTime to the current time.
A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.

Draw the UML diagram for the class then implement the class. Write a test program
that measures the execution time of sorting 100,000 numbers using selection sort.
 */
public class StopWatch {

    private long startTime = 0;
    private long endTime = 0;

    public static void main(String[] args) throws InterruptedException {

        Random randomGenerator = new Random();
        int array[] = new int [100];
        for(int i =0; i < 100; i++){
            array[i] = randomGenerator.nextInt(101);
        }
        StopWatch stopwatch_1 = new StopWatch();
        System.out.println(stopwatch_1.getStartTime());
        sort(array);
        stopwatch_1.stop();
        System.out.println(stopwatch_1.getEndTime());
        System.out.println(stopwatch_1.getElapsedTime());
        for(int i = 0; i< 100; i++) {
            System.out.print(array[i] + " ");
        }



    }



    StopWatch() {
        start();
    }



    public static void sort(int arr[])  //Selection Sort
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }


        private String getStartTime () {

        long totalMilliseconds = startTime;
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        return currentHour + ":" + currentMinute + ":" + currentSecond + " GMT";
    }

        private void start () {
        startTime = System.currentTimeMillis();
    }
        private void stop () {
        endTime = System.currentTimeMillis();
    }
        private String getEndTime () {

        long totalMilliseconds = endTime;
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        return currentHour + ":" + currentMinute + ":" + currentSecond + " GMT";
    }

        private long getElapsedTime () {
        long elapsedTime = endTime - startTime;
        return elapsedTime;
    }
}

