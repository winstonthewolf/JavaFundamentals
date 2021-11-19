package ObjectOrientedThinking;

import java.util.Scanner;

public class Split {


    public static void main(String[] args) {
                      split("hi","[A-Z]");
    }
    public static void split(String s, String regex){
        //String split method
        //If delimiter/character is matched then print it out

        //REcognize where the delimiter is, print string before it until the last delimiter, print the current delimeter
        String variableString = "hello+hello+";
        if (variableString.matches("([\\w]+[\\W])+")){
            System.out.println("Delimiter found");
        }

        /*

        Solution so far but need to incorporate regex argument
        index = 0;
        while(hasNext){
            if(charAt(i)= nonWord)
                print substring(0,i-1)
                print charAt(i) on the same line with a comma;
                index = i +1;
        }
        if matches regex then print out.
          */

        String [] array;
        //need to count how many strings there are to initialize String array


        Scanner input = new Scanner(System.in);
        int index = 0;
        while(input.hasNext()){
            for(int i =0; i< s.length(); i++) {
                if (s.charAt(i) == ASCII CODE)
                    s.substring(0, i-1);
            }
        }

        /*
            String.length();
            I want to know how many delimters there are
                There are atleast the same number of substrings as there are delimeters. need to check if there is more characters after last delimeter
            I want to know how many seperate words there are  including delimeters soo that I can initialize String []Arry below
            if hasNext character/s then nextDelimeterIndex+1 print/store through index String.length-1
            String [] array = String.substring(index, NextdelimterIndex -1)
            print CharAt(nextDelimterIndex)

         Can count all characters, then account for the delimeters and see how many..

          Latest Solution angle:
          Count each instance of any sequence of characters until a delimeter. Then also count the delimeter. Add these totals together to get total length of String array to initialize.
          else if no more characters the last characters read over since the last delimeter was the last word.


         */
    }

}
