package ObjectOrientedThinking;

import java.util.Scanner;

public class Split {


    public static void main(String[] args) {
                      split("hi#Hello#okay","#");
    }
    public static void split(String s, String regex){
        //String split method
        //If delimiter/character is matched then print it out

        //REcognize where the delimiter is, print string before it until the last delimiter, print the current delimeter

        int regexIndex = 0;
        int count = 0;
        if(regex.length() == 1) {  //This part is for counting the number of strings and regex so that I can make an array of that size
            int i = 0;
            while (i < s.length()) {
                if (s.charAt(i) == regex.charAt(0)){
                    count++; //adding to counter for every regex character encountered
                    count++; //adding to counter for every string encountered which we assume is before every regex encounter

                    regexIndex = i;
                    i++;
                }
            }
            if(s.charAt(s.length()-1) != regex.charAt(0)){
                count++;
            }
        }

        String [] inputString = new String[count];


        int i = 0;
        int tracker = 0;
        int counter=0;
        if(regex.length() == 1) {  //This part is for counting the number of strings and regex so that I can make an array of that size
            while (i < s.length()) {
                if (s.charAt(i) == regex.charAt(0)){

                    regexIndex = i;
                    i++;
                    inputString[counter] = s.substring(tracker, regexIndex);
                    inputString[counter + 1] = Character.toString(s.charAt(i));

//                        store in x = Substring(from tracker to regexIndex)
//                        store in x = Character.toString(regex);

                    tracker = regexIndex + 1;
                    }

                }
            }
            if(s.charAt(s.length()-1) != regex.charAt(0)){
                counter = counter + 1;
            }
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


//        Scanner input = new Scanner(System.in);
//        int index = 0;
//        while(input.hasNext()){
//            for(int i =0; i< s.length(); i++) {
//                if (s.charAt(i) == ASCII CODE)
//                    s.substring(0, i-1);
//            }
//        }

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

           Count string character 1 time until the next delimeter is hit then add the count again to get total number of words.
           Delimters = all nonWord characters on keyboard.

           If you encounter more word characters after a delimeter count it as another string



         */



//        count = 0;
//        while(charAt(i) = delimeter){
//
//            count++; //count for delimeter
//            count++; //count for word string
//
//        }
//
//
//        if(charAt(string.length-1) =word Char){
//            count ++; count last string if there is one
//        }
    }

}
