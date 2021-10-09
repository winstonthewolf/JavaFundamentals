public class DaysInYear {
    //write a method that displays the number of days in the years
    // between 2014 and 2034
    public static void main(String[] args){

        System.out.println(numberOfDaysInAYear(2020));
    }
    //Solved
 /*   public static int numberOfDaysInAYear(int year){
        // Leap year occures every 4 years, except for years that are divisable by 100 and not divisable by 400.
        if((year % 4 == 0)){
            if ((year % 100 == 0) && (year % 400 != 0))
                return 365;
            else
                return 366;
        }else{
            return 366;
        }
    }*/
//Solved
    public static int numberOfDaysInAYear(int year){
        // Leap year occures every 4 years, except for years that are divisable by 100 and not divisable by 400.
        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0) )){
            return 366;
        }else{
            return 365;
        }
    }
}
/*
    Original wrong solution
    public static int numberOfDaysInAYear(int year){ WRONG . Analyze
        // Leap year occures every 4 years, except for years that are divisable by 100 and not divisable by 400.
        if((year % 4 == 0) && ((year % 100 != 0) && (year % 400 == 0) )){
            return 366;
        }else{
            return 365;
        }
    }*/

/*
Can do !((condition) &&(condition)) which will be evaulated as below written
    2nd iteration of wrong solution
    public static int numberOfDaysInAYear(int year){ WRONG . Analyze
        // Leap year occures every 4 years, except for years that are divisable by 100 and not divisable by 400.
        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0) )){
            return 366;
        }else{
            return 365;
        }
    }*/
