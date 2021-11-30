package ObjectOrientedThinking;

import java.util.Scanner;

public class Split {


    public static void main(String[] args) {
        split("hi$Hello$okay$cheerio", "$");
    }

    public static void split(String s, String regex) {

        int regexIndex = 0;
        int count = 0;
        boolean characterNoMatchRegex = s.charAt(s.length() - 1) != regex.charAt(0);
        if (regex.length() == 1) {//This part is for counting the number of strings and regex so that I can make an array of that size

            int i = 0;
            while (i < s.length()) {

                if (s.charAt(i) == regex.charAt(0)) {

                    count++; //adding to counter for every regex character encountered
                    count++; //adding to counter for every word encountered which we assume is before every regex encounter

                    regexIndex = i;
                    i++;
                }
                i++;
            }
            if (characterNoMatchRegex) {
                count++;
            }
        }

        String[] inputString = new String[count];

        int i = 0;
        int tracker = 0;
        int counter = 0;
        if (regex.length() == 1) {
            while (i < s.length()) {
                if (s.charAt(i) == regex.charAt(0)) {
                    regexIndex = i;
                    inputString[counter] = s.substring(tracker, regexIndex);
                    inputString[++counter] = Character.toString(s.charAt(i));
                    counter++;


                    i++;

                    tracker = regexIndex + 1;
                }

                i++;

            }
        }
        if (characterNoMatchRegex) {
            inputString[counter] = s.substring(tracker);
        }

        for (String x : inputString) {
            System.out.println(x);
        }
    }
}

        //need to count how many strings there are to initialize String array



        /*
            I want to know how many delimters there are
            There are atleast the same number of substrings as there are delimiters. need to check if there is more characters after last delimeter
            I want to know how many separate words there are including delimiters so that I can initialize String []Arry below
            if hasNext character/s then nextDelimeterIndex+1 print/store through index String.length-1
            String [i] array = String.substring(NextdelimterIndex + 1, index =String.length -1)
            String [i++] array= CharAt(nextDelimterIndex)


          Latest Solution angle:
          Count each instance of any sequence of characters until a delimiter. Then also count the delimiter.
          else if no more characters, the last characters read over since the last delimiter was the last word.
          Add these totals together to get total length of String array to initialize.

           Count word as 1 until the next delimiter is hit then add 1 to the count again for the delimiter to get total number of words and delimiters.
           Delimiters = all nonWord characters on keyboard.

           If you encounter more word characters after a delimiter count it as another word



         */






