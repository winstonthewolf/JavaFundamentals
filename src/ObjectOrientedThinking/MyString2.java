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
        for (int i =0 ; i < str.length(); i++){                                                    //TODO: Can maybe simplify if else statement to one and merge both conditionals when doing the < and > operations

            if(str.charAt(i) == s.charAt(i)){
               continue;
            }else{
                if((int)str.charAt(i) < (int)s.charAt(i)){ // if object character precedes argument character
                    match = false;
                    return str.charAt(i) - s.charAt(i);          //Will be a negative result. Will tell how many characters of argument string (exceeded)behind the object character is.
                }else{
                       if((int)str.charAt(i) > (int)s.charAt(i)) {
                           match = false;
                           return s.charAt(i) - str.charAt(i); //Will do the same as above but now opposites
                       }
                }
            }
        }

        return 0; //Strings are equal lexicographically
    }
/*
   TODO: If there is no index position at which they differ, then the shorter string lexicographically precedes the longer string. In this case, compareTo returns the difference of the lengths of the strings -- that is, the value:

     this.length()-anotherString.length()


    TODO:      Returns: the value 0 if the argument string is equal to this string; a value less than 0 if this string is lexicographically less than the string argument; and a value greater than 0 if this string is lexicographically greater than the string argument.
 */


    public static void main(String []args){
        MyString2 str = new MyString2("Hello");
        System.out.println(str.compare("Hello"));
    }
}
