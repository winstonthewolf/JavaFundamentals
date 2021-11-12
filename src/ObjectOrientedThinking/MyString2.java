package ObjectOrientedThinking;

public class MyString2 {

    private String str;

    public MyString2() {

    }
    public MyString2(String s){
       str  = s;
    }
    public int compare(String s){

        boolean match = true;
        String longestString; //Ensures the longest string will be used as the number of character iterations
        String shortString;
        if(str.length() > s.length()) {
            longestString = str;
            shortString = s;
        } else {
            longestString = s;
            shortString = str;
        }
        for (int i = 0 ; i < shortString.length(); i++){                                                    //TODO: Can maybe simplify if else statement to one and merge both conditionals when doing the < and > operations
                  
            if(shortString.charAt(i) == longestString.charAt(i)){
               continue;
            }else{
                if((int)longestString.charAt(i) < (int)shortString.charAt(i)){ // if object character precedes argument character
                    match = false;
                    return longestString.charAt(i) - shortString.charAt(i);          //Will be a negative result. Will tell how many characters of argument string (exceeded)behind the object character is.
                }else{
                       if((int)longestString.charAt(i) > (int)shortString.charAt(i)) {
                           match = false;
                           return shortString.charAt(i) - longestString.charAt(i); //Will do the same as above but now opposites
                       }
                }
            }
        }
        if(longestString.length() > shortString.length()){
            return longestString.length() - shortString.length();// if all characters are equal then return 0 or a number n representing how many extra characters there were (always a positive number).. Short string precedes longest String lexicographically
        }else
            return 0; //Strings are equal lexicographically
    }

    /*
    There are 3 possible return codes. 0, Strings are lexographically equal. N < 0, when two characters are not identical, this number represents the number of characters away from eachoothers string respective index
    N > 0, a number n representing how many extra characters there were in the longest string  (always a positive number)
     */

/*
   TODO: If there is no index position at which they differ, then the shorter string lexicographically precedes the longer string. In this case, compareTo returns the difference of the lengths of the strings -- that is, the value:

     this.length()-anotherString.length()


    TODO:      Returns: the value 0 if the argument string is equal to this string; a value less than 0 if this string is lexicographically less than the string argument; and a value greater than 0 if this string is lexicographically greater than the string argument.
 */

    /*

    Need to figure out way to discern between when the returned value is from the length of strings vs when its a character difference
     */

    public static void main(String []args){
        MyString2 str = new MyString2("Helli");
        System.out.println(str.compare("Hello"));
    }
}
