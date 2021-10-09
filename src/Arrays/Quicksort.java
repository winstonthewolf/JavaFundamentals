public class Quicksort {
    static int a[] = {29,18,7,56,64,33,128,70,78,81,12,5};
    static int num = 12;
    static int max = num-1;

    static void swap(int i, int j)
    {
        int t=a[i]; a[i]=a[j]; a[j]=t;
    }

    static int partition(int first, int last)
    {
     int pivot = a[first];
     int i = first;
     int j = last + 1;

     do
     {
         do{ i++; } while ((i <=max) && (a[i]<pivot));
         do {j--;} while ((j<= max) && (a[j]>pivot));
         if (i<j) { swap(i,j); }
     }
     while (j >i);

     swap(j,first);
     return j;
    }

    static void quicksort(int first, int last)
    {
        int p =0;
        if(first<last)
        {
            p=partition(first, last);
            quicksort(first, p-1);
            quicksort(p+1, last);
        }
    }

    public static void main(String args[]){
        quicksort(0,max);
        for (int i=0; i<=max; i++)
        {
            System.out.println(a[i]);
        }
    }
}
