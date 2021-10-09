import java.util.*;
public class AvgArr {

    public static int average(int [] array){

        int avg = 0;
        for(int i =0; i < array.length; i++) {
            avg += array[i];
        }
        avg = avg / array.length;

        return avg;
    }

    public static double average(double[] array){

        double avg =0;
        for(int i =0; i< array.length; i++){
            avg += array[i];
        }
        avg = avg / array.length;
        return avg;
    }



    public static void main(String [] args){

        double [] arr = new double[10];
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 10 values");
        for(int i =0; i < arr.length; i++){
            arr[i] = input.nextDouble();
        }

        System.out.println(average(arr));


    }
}
