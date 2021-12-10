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

        num_of_keys = 0;
        for (int i = 0; i < matrixA.getSize(); i++) {
            for (int j = 0; j < matrixA.getSize(); j++) {
                if (matrixA.getMatrix()[j][i] == 1)
                    num_of_keys++;
            }
            columnTotal.add(num_of_keys);
            num_of_keys = 0;
        }

        for(int i = 0; i < matrixA.getSize(); i++) {
            for(int j = 0 ; j < matrixA.getSize(); j++) {
                System.out.print(matrixA.getMatrix()[i][j]+ " ");
            }
            System.out.println();
        }

        int maxCol = Collections.max(columnTotal);
        System.out.println(maxCol);
        int indexOfMaxCol = columnTotal.indexOf(maxCol);
        //ystem.out.println(indexOfMaxCol);
        int maxRow = Collections.max(rowTotal);
        System.out.println(maxRow);

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