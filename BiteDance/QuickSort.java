package BiteDance;

import javax.xml.soap.SOAPHeaderElement;
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
            int insertVal=array[i];//准备插入的数据
            int index=i-1;
            while(index>=0&&array[index]>insertVal){
                array[index+1]=array[index];
                index--;
            }
            array[index+1]=insertVal;
        }
    }
    //冒泡排序
    public static void bubbleSort(int [] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j+1]<array[j]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }

        }
    }
    //希尔排序
    public static  void shellInsertSort(int [] array,int dk){
        for(int i=dk;i<array.length;i++){
            int insertVal=array[i];
            int index=i-dk;
            /*for(;j>=0&&insertVal<array[j];j=j-dk){
                array[j+dk]=array[j];
            }*/
            while(index>=0&&array[index]>insertVal){
                array[index+dk]=array[index];
                index-=dk;
            }
            array[index+dk]=insertVal;
        }

    }
    public static void shellSort(int[] array){
        int dk=array.length/3+1;
        while(dk>1){
            shellInsertSort(array,dk);
            dk=dk/3+1;
        }
    }


    public static void main(String[] args) {
        int [] array=new int[]{4,5,6,3,2,1};
        QuickSort.quickSort(array);
        System.out.println(Arrays.toString(array));
        int [] array1=new int[]{4,5,6,3,2,1};
        insertSort(array1);
        System.out.println(Arrays.toString(array1));
        int [] array2=new int[]{4,5,6,3,2,1};
        bubbleSort(array2);
        System.out.println(Arrays.toString(array2));
        int [] array3=new int[]{4,5,6,3,2,1};
        shellSort(array3);
        System.out.println(Arrays.toString(array3));
    }
}

