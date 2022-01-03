package InheritanceAndPolymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateArrayList {

    public static void main(String[] args) {
        Integer [] array = {1,1,2,3,4,4,5,6,6};
        ArrayList<Integer>  list = new ArrayList<>(Arrays.asList(array));
        for(Integer x: list){
            System.out.println(x);
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list){

        Integer [] array = list.toArray(array);
        int [] indexOfDuplicates
        for (int i = 0; i < array.length; i++){
               for(int j = 1; j < array.length; i++){

                   if(array[i] == array[j]){
                       list.remove()
                   }
               }
        }

    }
}
