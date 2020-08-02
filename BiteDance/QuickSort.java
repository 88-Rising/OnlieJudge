package BiteDance;

import java.util.Arrays;

public class QuickSort {
    //快速排序核心思想 就是分区
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
    //插入排序
    public static void insertSort(int[] array){
        for(int i=1;i<array.length;i++){
            int insertVal=array[i];
            int index=i-1;//被插入的位置（准备使用InsertVal和前一个数进行比较）
            while(index>=0&&insertVal<array[index]){
                array[index+1]=array[index];
                index--;
            }
            array[index+1]=insertVal;
        }

    }


    public static void main(String[] args) {
        int [] array=new int[]{4,5,6,3,2,1};
        QuickSort.quickSort(array);
        System.out.println(Arrays.toString(array));
        int [] array1=new int[]{4,5,6,3,2,1};
        insertSort(array1);
        System.out.println(Arrays.toString(array1));
    }
}

