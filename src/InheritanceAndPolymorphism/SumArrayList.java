/*
* (Sum ArrayList ) Write the following method that returns the sum of all num-
bers in an ArrayList :
    public static double sum(ArrayList<Double> list)
Write a test program that prompts the user to enter five numbers, stores them in
an array list, and displays their sum
* */

package InheritanceAndPolymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class SumArrayList {

    public static void main(String [] args){

        Double [] array = {1.0,2.0,3.0,4.0,5.0};
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(sum(list));
    }

    public static double sum(ArrayList<Double> list){
        double total =0;
        for (double x: list) {
            total += x;
        }
        return total;
    }
}
