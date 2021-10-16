package ObjectOrientedThinking;/*
Design a class named Time . The class contains:
- The data fields hour , minute , and second that represent a time.
- A no-arg constructor that creates a Time object for the current time. (The
values of the data fields will represent the current time.)
- A constructor that constructs a Time object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds. (The values of the data
fields will represent this time.)
- A constructor that constructs a Time object with the specified hour, minute,
and second.
- Three getter methods for the data fields hour , minute , and second ,
respectively.
- A method named setTime(long elapseTime) that sets a new time for the
object using the elapsed time. For example, if the elapsed time is 555550000
milliseconds, the hour is 10 , the minute is 19 , and the second is 10 .

- Draw the UML diagram for the class then implement the class. Write a
test program that creates three Time objects (using new Time() , new
Time(555550000) , and new Time(5, 23, 55) ) and displays their hour,
minute, and second in the format hour:minute:second.
(Hint: The first two constructors will extract the hour, minute, and second
from the elapsed time. For the no-arg constructor, the current time can be
obtained using System.currentTimeMillis(). Assume the time is in GMT.)
* */

public class TimeClass {
    private long hour;
    private long minute;
    private long second;

    public static void main(String[] args){
        TimeClass time = new TimeClass();
        System.out.println(time.getHour() + ":"+ time.getMinute()+ ":"+ time.getSecond());

        time.setTime(555550000);
        System.out.println(time.getHour() + ":"+ time.getMinute()+ ":"+ time.getSecond());

        TimeClass time2 = new TimeClass(5,23,55);
        System.out.println(time.getHour() + ":"+ time.getMinute()+ ":"+ time.getSecond());

    }

    public TimeClass(){

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = totalHours % 24;

    }

    public TimeClass(Long elapsedTime){


        long totalMilliseconds = elapsedTime;
        long totalSeconds = totalMilliseconds / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = totalHours % 24;
    }

    public TimeClass(int hour, int minute, int second){

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour(){

        return this.hour;
    }

    public long getMinute(){
        return this.minute;
    }

    public long getSecond(){
        return this.second;
    }

    public void setTime(long elapsedTime){
        long totalMilliseconds = elapsedTime;
        long totalSeconds = totalMilliseconds / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = totalHours % 24;

    }
}
