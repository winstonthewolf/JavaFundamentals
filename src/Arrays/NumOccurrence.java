/*
* Write a program that reads the integers between
1 and 50 and counts the occurrences of each. Assume the input ends with 0
*
* */
import java.util.*;

public class NumOccurrence {

    public static void main(String [] args ){

        int [] numbers = new int[100];
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        while(num != 0){
            if((num >=1 ) && (num <= 100)){
                numbers[num]++;
                num = input.nextInt();
           }
        }

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] >=1){
                System.out.println("Number "+ i + " occurred "+numbers[i]+" times");
            }
        }
    }
}
