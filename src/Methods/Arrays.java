public class Arrays {
 //Make a case study out of this to ask on the forums.
    public static void main(String[] args) {


        int[] list = {1, 2, 3, 4, 5};
        reverse(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    public static void reverse(int[] list) {
        int[] newList = new int[list.length];

        for(int i = 0; i < list.length; i++)
            newList[i] = list[list.length - 1 - i];

        System.out.println();
        for (int i = 0; i < newList.length; i++)
            System.out.print(newList[i] + " ");

        System.out.println();


        list = newList;


        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();

    }
}
