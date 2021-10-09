import java.util.Random;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args){
        Random rand = new Random() ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(rand.nextInt(2));
            }
            System.out.println();
        }

    }
}
