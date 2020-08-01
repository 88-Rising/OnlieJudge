package BiteDance;

import java.util.Arrays;

public class QuickSort {
    private static int partition(int[] array, int low, int high) {
        int i=low;
        int j=high;
        int key=array[low];
        while(i<j){

            while(i<j&&key<=array[j]){
                j--;
            }
            if(i<j&&key>array[j]){
                array[i]=array[j];
                i++;
            }
            while(i<j&&key>=array[i]){
                i++;
            }
            if(i<j&&key<array[i]){
                array[j]=array[i];
                j--;
            }

        }
        array[i]=key;
        return i;
    }


    public static void quickSort(int[] array,int low,int high){
        if(low<high){
            int index=partition(array,low,high);

            quickSort(array,low,index-1);
            quickSort(array,index+1,high);

        }
    }



    public static void quickSort(int[] array){
     int low=0;
     int high=array.length-1;
     quickSort(array,low,high);

    }

    public static void main(String[] args) {
        int [] array=new int[]{4,5,6,3,2,1};
        QuickSort.quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}

