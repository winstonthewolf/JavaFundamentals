package Arrays;/*
  *7.19 (Sorted?) Write the following method that returns true if the list is already sorted
        in decreasing order.

 public static boolean isSorted(int[] list)

 Write a test program that prompts the user to enter a list and displays whether
 the list is sorted or not. Here is a sample run. Note that the first number in the
 input indicates the number of the elements in the list. This number is not part
 of the list.

 Enter list: 8 10 1 5 16 61 9 11 1
 The list is not sorted

 Enter list: 10 21 11 9 7 5 4 4 3 1 1
 The list is already sorted

 */
import java.util.*;
public class SortedBool {

    public static boolean isSorted(int[] list){
        //compare the sorted array -after calling a sorting method on it and reversing it- to the list array and see if all values are in the correct position
        boolean isSorted = false;
        int  [] listCopy = new int[list.length];
        System.arraycopy(list,0,listCopy,0,list.length);
        Arrays.sort(listCopy);
        for(int i =0; i< list.length/2; i++){
            int temp = listCopy[i];
            listCopy[i] = listCopy[listCopy.length - 1  -  i]; // reverse the array.
            listCopy[listCopy.length - 1  -  i]  = temp;
        }
        if(Arrays.equals(list, listCopy))
            isSorted = true;
        return isSorted;
    }

    public static void main(String []args){
        int [] array  =  {1, 2, 3 ,4 ,5, 6, 7 ,8 ,9 ,10};
        System.out.println(isSorted(array));
    }
}
