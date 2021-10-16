/*
1 hour so far as of today
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
        MyInteger integer = new MyInteger(10);
        System.out.println(integer.getValue());
    }
    private int value =0;

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
   /* private boolean isPrime(){
        if(this.value % 2 == 0){
            return true;
        }
    }*/

}
