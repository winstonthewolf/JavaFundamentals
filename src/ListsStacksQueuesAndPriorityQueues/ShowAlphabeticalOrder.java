package ListsStacksQueuesAndPriorityQueues;

import java.io.File;
import java.io.Serializable;
import java.util.*;

public class ShowAlphabeticalOrder {

    private File sourceFile;

    ShowAlphabeticalOrder(File sourceFile){

        try {
            ArrayList<String> list = readFile(sourceFile);
            print(list);
            System.out.println();
            sort(list);
            print(list);
            System.out.println();
            sortDescending(list);
            print(list);
        } catch (Exception e) {
            System.out.println("Unable to open file for reading");
            e.printStackTrace();
        }
    }
//    public int compare(String s1, String s2){
//
//    }

    public ArrayList<String> readFile(File sourceFile) throws Exception{

        if(!sourceFile.exists()){
            System.out.println("Source file does not exist. Choose different file");
            System.exit(-1);
        }

        ArrayList<String> stringList = new ArrayList<String>();
        try( Scanner in = new Scanner(sourceFile)){

           while(in.hasNext()){
              stringList.add(in.next());
           }
       }
        return stringList;
    }

    public void sort(ArrayList<String> list){
        Iterator<String> iterator = list.iterator();
        Iterator<String> iteratorClone = list.iterator();
        String currentMin;
        int currentMinIndex;
        String next;
        iteratorClone.next(); //Start iterator at second element
        int i = 0;
        while(iterator.hasNext()){
            for(int k =0; k < i; k++) //   Start iteratorClone one element in front of iterator
                if(iteratorClone.hasNext()){
                    iteratorClone.next();
                }
            i++; //Keep track of how many elements infront iteratorClone needs to be
            next = iterator.next();
            currentMin = next;
            currentMinIndex = list.indexOf(currentMin); //keep an eye out for duplicates. Find out what happens when the currentMin is a duplicate. Returns index of first encountered object

            while(iteratorClone.hasNext()){
                String nextListItem = iteratorClone.next();
                if (currentMin.compareTo(nextListItem) > 0){
                   currentMin = nextListItem;
                   currentMinIndex = list.indexOf(nextListItem);
               }
            }

            if(currentMinIndex != list.indexOf(next)){
                list.add(currentMinIndex, next );
                list.remove(currentMinIndex + 1);
                list.add(list.indexOf(next), currentMin);
                list.remove(list.indexOf(next) + 1);
                iterator = list.iterator();
                iteratorClone = list.iterator();
            }
            iteratorClone = list.iterator(); //reset iterator
        }
    }
    public void sortDescending(ArrayList<String> list){
        Collections.reverse(list);
    }

    public static void print(ArrayList<String> list){

        for (String s: list
             ) {
            System.out.println(s);

        }

    }
    public static void main(String[] args) {

        if(args.length < 1) {
            System.out.println("Usage: java ShowAlphabeticalOrder <fileToBeSorted>");
        }
        else{
            ShowAlphabeticalOrder list1 = new ShowAlphabeticalOrder(new File(args[0]));
        }
    }
}
