/*
(The MyDate class) Design a class named MyDate . The class contains:

- The data fields year , month , and day that represent a date. month is 0-based,
i.e., 0 is for January.
- A no-arg constructor that creates a MyDate object for the current date.
- A constructor that constructs a MyDate object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds.
- A constructor that constructs a MyDate object with the specified year, month,
and day.
- Three getter methods for the data fields year , month , and day , respectively.
- A method named setDate(long elapsedTime) that sets a new date for
the object using the elapsed time.
- Draw the UML diagram for the class then implement the class. Write a test
program that creates two MyDate objects (using new MyDate() and new
MyDate(34355555133101L) ) and displays their year, month, and day.
(Hint: The first two constructors will extract the year, month, and day
from the elapsed time. For example, if the elapsed time is 561555550000
milliseconds, the year is 1987 , the month is 9 , and the day is 18 . You may
use the GregorianCalendar class discussed in Programming Exercise 9.5
to simplify coding.)
 */

package ObjectOrientedThinking;

import java.util.Calendar;

public class MyDate {
    int year, month, day;

    public static void main(String[] args) {
        MyDate date = new MyDate();
        System.out.println("Year: " + date.getYear() + " Month: "+ date.getMonth() +" Day: "+ date.getDay());

        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("Year: " + date2.getYear() + " Month: "+ date2.getMonth() +" Day: "+ date2.getDay());
    }
    public MyDate(){

        java.util.Calendar date = Calendar.getInstance();
        this.year = date.get(Calendar.YEAR);
        this.month = date.get(Calendar.MONTH);
        this.day = date.get(Calendar.DAY_OF_MONTH);

    }

    public MyDate(long milliSec){

        java.util.Calendar date = Calendar.getInstance();
        date.setTimeInMillis(milliSec);
        this.year = date.get(Calendar.YEAR);
        this.month = date.get(Calendar.MONTH);
        this.day = date.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day){

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(long elapsedTime){

        java.util.Calendar date = Calendar.getInstance();
        date.setTimeInMillis(elapsedTime);
        this.year = date.get(Calendar.YEAR);
        this.month = date.get(Calendar.MONTH);
        this.day = date.get(Calendar.DAY_OF_MONTH);
    }

    public int getYear(){
        return this.year;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }
}
