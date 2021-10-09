
public class BinarySearch {

    public static void main(String[] args ){
        int[] list = {1,2,3,4,5};
        System.out.println(binarySearch(3,list));
    }

    public static boolean binarySearch ( int key, int[] list ){

        int halfIndex = list.length/2-1; //needs to subtract 1 so index is not out of bounds
        int lastElementOfList = list.length-1;
        do {
            if (key == list[halfIndex])
                return true;
            if (key < list[halfIndex]) {
                halfIndex = halfIndex / 2;
            }else { //(lastIndex)4/2+1/2 //<--- The Key thought that solved it all. array of 5 elements
                halfIndex = (lastElementOfList / 2) + (lastElementOfList / 4);  //plus half of that result. Getting the half index of the right half of the array
            }
        } while(key != list[halfIndex]);
        return true;
    }
}

