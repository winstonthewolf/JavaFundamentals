package ObjectOrientedThinking;

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
    }

}
