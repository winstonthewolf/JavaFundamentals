/*
(Use the Random class) Write a program that creates a Random object with seed
1000 and displays the first 50 random integers between 0 and 100 using the nextInt(100) method.

 */

import java.util.Random;

public class Randomizer {

    public static void main(String [] args){
        Random generator = new Random(1000);
        for (int i = 0; i < 50 ; i++) {
            System.out.print(" "+generator.nextInt(100));
        }
    }

}
