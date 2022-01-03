/*
*
* (Largest rows and columns) Write a program that randomly fills in 0 s and 1 s
into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
most 1 s
* */
package InheritanceAndPolymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    int size;
    int [][]matrix;
    public static void main(String[] args) {
        Matrix matrixA = new Matrix();
        matrixA.makeMatrix();
        ArrayList<Integer> rowTotal = new ArrayList<>(matrixA.getSize());
        //System.out.println(matrixA.getSize());
        int num_of_keys = 0;
        for (int i = 0; i < matrixA.getSize(); i++) {
            for (int j = 0; j < matrixA.getSize(); j++) {
                if (matrixA.getMatrix()[i][j] == 1)
                    num_of_keys++;
            }
            rowTotal.add(num_of_keys);
            num_of_keys =0;

        }


        ArrayList<Integer> columnTotal = new ArrayList<>(matrixA.getSize());

        num_of_keys = 0; //Counts occuranes of '1's.
        for (int i = 0; i < matrixA.getSize(); i++) {
            for (int j = 0; j < matrixA.getSize(); j++) {
                if (matrixA.getMatrix()[j][i] == 1)
                    num_of_keys++;
            }
            columnTotal.add(num_of_keys);
            num_of_keys = 0; //reset for next column
        }

        for(int i = 0; i < matrixA.getSize(); i++) {
            for(int j = 0 ; j < matrixA.getSize(); j++) {
                System.out.print(matrixA.getMatrix()[i][j]+ " ");
            }
            System.out.println();
        }

         /*
         * To be able to track the rows with the same max and print those out at the end,
         * I can call the collections.max method and store the value in V, then
         * I can remove from the list that max number. Next I can compare that
         * value in V to another call to collections.max and see if I get the same value
         * this would mean that I would have another row to print as having max. 
         * */


        int maxCol = Collections.max(columnTotal);
        System.out.println(maxCol);
        int indexOfMaxCol = columnTotal.indexOf(maxCol);
        //ystem.out.println(indexOfMaxCol);
        int maxRow = Collections.max(rowTotal);
        System.out.println(maxRow);

//        ArrayList <Integer> arrayOfMaxIndexes = new ArrayList();
//        rowTotal.forEach(==maxRow);

        int indexOfMaxRow = rowTotal.indexOf(maxRow);
               //Make it so that if multiple rows or columns have the same max then print those out too
        System.out.println("Max Row: "+ indexOfMaxRow);
        System.out.println("Max Column: "+ indexOfMaxCol);
    }

    public int [][] makeMatrix(){

        int [][] matrix;
        System.out.println("Size of matrix: ");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        matrix = new int[size][size];
        Random rand = new Random();
        for(int i =0; i< size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = rand.nextInt(2);
            }
        }
        this.matrix = matrix;
        return matrix;

    }

    public int getSize(){
        return this.size;
    }

    public int [][] getMatrix(){
       return matrix;
    }
}
