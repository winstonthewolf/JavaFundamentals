public class BinarySearch {

    public static void main(String[] args){

        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12};

        System.out.println(binarySearch(3, arr));

    }

    public static int binarySearch(int key, int []array){

        int low = 0;
        int high = array.length -1;

        while (high >= low) {
            int mid = (low + high)/2;
            if (key < array[mid])
                high = mid -1;
            else if (key == array[mid])
                return mid;
            else
                low = mid +1;
        }

        return - low -1;
    }
}
