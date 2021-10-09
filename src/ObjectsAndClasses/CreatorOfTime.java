/*
(Use the Date class) Write a program that creates a Date object, sets its elapsed
time to 10000 , 100000 , 1000000 , 10000000 , 100000000 , 1000000000 ,
10000000000 , and 100000000000 , and displays the date and time using the
toString() method, respectively.

 */

public class CreatorOfTime {

    public static void main(String [] args){

        java.util.Date date = new java.util.Date(10000);
        System.out.println(date.getTime());
        System.out.println(date);

        date = new java.util.Date(100000);
        System.out.println(date.getTime());
        System.out.println(date);

        date = new java.util.Date(1000000);
        System.out.println(date.getTime());
        System.out.println(date);

        date = new java.util.Date(10000000);
        System.out.println(date.getTime());
        System.out.println(date);

        date = new java.util.Date(100000000);
        System.out.println(date.getTime());
        System.out.println(date);

        date = new java.util.Date(1000000000);
        System.out.println(date.getTime());
        System.out.println(date);

        date = new java.util.Date(10000000000L);
        System.out.println(date.getTime());
        System.out.println(date);

        date = new java.util.Date(100000000000L);
        System.out.println(date.getTime());
        System.out.println(date);


    }
}
