public class SelectionSort {
    //Selects the first number then compares it to the next sequential smallest number and replaces its place with the first number
    //sorting from low to high.


    public static void main(String []args){

        int [] list = {9,8,3,7,6,1,4,2,5,10};

        selectionSort(list);
        for (int i =0 ; i <= list.length -1; i++ )
            System.out.print(list[i]+ " ");
    }
    public static void selectionSort(int [] list){

        for(int i = 0; i < list.length -1; i++){

            for(int j = i+1; j <= list.length-1; j++) {

                int temp = list[i];
                if (list[j] < list[i]){
                    list[i] = list[j];
                    list[j] = temp;
                }

            }
        }

    }


}
