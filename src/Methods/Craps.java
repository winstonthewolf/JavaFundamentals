import java.util.*;
public class Craps {
//    (Game: craps) Craps is a popular dice game played in casinos. Write a program
//    to play a variation of the game, as follows:
//    Roll two dice. Each die has six faces representing values 1, 2, . . ., and 6, respec-
//    tively. Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
//            lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
//            (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
//    a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
//    Your program acts as a single player. Here are some sample runs.
//


    //TO-DO: add feature to click when rolling to simulate tactility of rolling the dice
    //Remove redundant code
    //ALSO: Make a statistics chart to map rate of wins per number
    public static void main(String[] args){


        int sum = rollDice();
        System.out.println(sum);
        checkSum(sum);

    }

    public static int rollDice(){
        int dice1, dice2;
        Random rand = new Random();
        dice1 = rand.nextInt(6) + 1;
        dice2 = rand.nextInt(6) + 1;

        return  dice1 + dice2;

    }

    public static void checkSum(int sumOfDice){
        if(sumOfDice == 7 || sumOfDice == 11)
            System.out.println("***WINNER***");
        else {
            System.out.println("point");
            checkSumAfterPoint(sumOfDice);
        }

    }

    public static void checkSumAfterPoint(int sumOfDice){
          //Convert to a do-while loop to see performance instead of recursion
        int secondRoll = rollDice();
        System.out.println(secondRoll);
        if(secondRoll == 7) {
            System.out.println("----Loser----");
        }
        else if(sumOfDice == secondRoll) {
            System.out.println("****WINNER****");
        }else {
            checkSumAfterPoint(sumOfDice);
        }
    }

}
