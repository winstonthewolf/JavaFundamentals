/*
* Write the following method that returns the
maximum value in an ArrayList of integers
*
*        public static Integer max(ArrayList<Integer> list)
* */

package InheritanceAndPolymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class maxArrayListElement {


    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int nextNum;
        nextNum = input.nextInt();
        while(nextNum  != 0){
            nextNum = input.nextInt();
            list.add(nextNum);
        }
        System.out.println(max(list));
    }

    public static Integer max(ArrayList<Integer> list){

        return java.util.Collections.max(list);
    }
}
