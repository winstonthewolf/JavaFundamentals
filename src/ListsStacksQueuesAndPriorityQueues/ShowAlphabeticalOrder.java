package ListsStacksQueuesAndPriorityQueues;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ShowAlphabeticalOrder {

    private File sourceFile;

    ShowAlphabeticalOrder(File sourceFile){

        try {
            LinkedList<String> list = readFile(sourceFile);
            
            sort(list);

            sortDescending(list);
            print(list);
        } catch (Exception e) {
            System.out.println("Unable to open file for reading");
            e.printStackTrace();
        }
    }


    public LinkedList<String> readFile(File sourceFile) throws Exception{

        if(!sourceFile.exists()){
            System.out.println("Source file does not exist. Choose different file");
            System.exit(-1);
        }

        LinkedList<String> stringList = new LinkedList<String>();
        try( Scanner in = new Scanner(sourceFile)){

           while(in.hasNext()){
              stringList.add(in.next());
           }
       }
        return stringList;
    }

    public void sort(LinkedList<String> list){
        java.util.Collections.sort(list);
    }
    public void sortDescending(LinkedList<String> list){
        Collections.reverse(list);
    }

    public static void print(LinkedList<String> list){

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
