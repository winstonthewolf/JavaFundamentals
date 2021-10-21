/*
Design a class named MyInteger. The class contains:
        - An int data field named value that stores the int value represented by this object.
        - A constructor that creates a MyInteger object for the specified int value.
        - A getter method that returns the int value.
        - The methods isEven(), isOdd(), and isPrime() that return true if the
        value in this object is even, odd, or prime, respectively.
        - The static methods isEven(int), isOdd(int), and isPrime(int) that
        return true if the specified value is even, odd, or prime, respectively.
        - The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd,
        or prime, respectively.
        - The methods equals(int) and equals(MyInteger) that return true if
        the value in this object is equal to the specified value.
        - A static method parseInt(char[]) that converts an array of numeric
        characters to an int value.
        - A static method parseInt(String)that converts a string into an int value.
        Draw the UML diagram for the class then implement the class. Write a client program that tests all methods in the class.
*/

package ObjectOrientedThinking;

public class MyInteger {

    public static void main (String []args){
        MyInteger integer = new MyInteger(7);
        System.out.println(integer.isPrime());                      //Testing methods isPrime(), isPrime(integer), isPrime(MyInteger). Should print out 'true' to following 3 statements if correct code

        System.out.println(MyInteger.isPrime(integer));

        System.out.println(MyInteger.isPrime(7));

        System.out.println(integer.equals(7));                      //Testing equals(int) and equals(MyInteger). Should print 'true' if correct code

        System.out.println(integer.equals(new MyInteger(7)));

        char [] char_array = {'5','4','3','2','1'};                 //Testing static methods parseInt(char[]) and parseInt(String)
        System.out.println(MyInteger.parseInt(char_array));

        String myNumber = "32000";
        System.out.println(MyInteger.parseInt(myNumber));
    }

    private int value;

    MyInteger(int value){
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }

    private boolean isEven(){
        return this.value % 2 == 0;
    }
    private boolean isOdd(){
        return this.value % 2 == 1;
    }
    private boolean isPrime(){
        if(this.value < 2)
            return false;

        for(int i = 2; i < this.value / 2; i++){

            if(this.value % i == 0)
                return false;
        }

        return true;
    }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    public static boolean isOdd(int value){
        return value % 2 == 1;
    }
    public static boolean isPrime(int value){
        if(value < 2)
            return false;

        for(int i = 2; i < value / 2; i++){

            if(value % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger value){
        return value.value % 2 == 0;

    }

    public static boolean isOdd(MyInteger value){
        return value.value % 2 == 1;

    }

    public static boolean isPrime(MyInteger value){
        if(value.value < 2)
            return false;

        for(int i = 2; i < value.value / 2; i++){

            if(value.value % i == 0)
                return false;
        }
        return true;
    }

    private boolean equals(int value){
        return this.value == value;
    }

    private boolean equals(MyInteger value){
        return this.value == value.value;
    }

    public static int parseInt(char[] char_array){

        String num_string = new String(char_array);
        return Integer.parseInt(num_string);

    }

    public static int parseInt(String num_string){
        return Integer.parseInt(num_string);
    }

}
