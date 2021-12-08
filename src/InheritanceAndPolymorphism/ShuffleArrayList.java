// Write the following method that shuffles the elements in
//an ArrayList of integers:
//public static void shuffle(ArrayList<Integer> list)
package InheritanceAndPolymorphism;

import java.util.ArrayList;

public class ShuffleArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);

        shuffle(list);

        for (Integer n:list) {

            System.out.println(n);

        }
    }

    public static void shuffle(ArrayList<Integer> list){
        java.util.Collections.shuffle(list);
    }
}
