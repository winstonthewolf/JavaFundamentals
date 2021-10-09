import java.util.*;
public class Reverse {

    public static void reverse( int [] arr){
        int temp;
        for(int i=0; i < arr.length/2; i++){ //Was 'i < arr.length' before I corrected it
            temp = arr[i];                  //Because it was swapping items in array twice
            arr[i] = arr[arr.length - 1 - i];//After the first half being swapped it went ahead and continued swapping the second half of the array
            arr[arr.length - 1 - i] = temp;//You only need to swap the first half of the array to swap all elements

        }
    }

    public static void main( String [] args){

        System.out.println("Enter 10 numbers: ");
        Scanner in = new Scanner(System.in);
        int [] arr = new int[10];
        for(int i =0; i< 10; i++){
            arr[i] = in.nextInt();
        }

        reverse(arr);
        for(int i =0; i < 10;  i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
