package Daily;

import java.util.Arrays;

public class QuickSorting {
    public static int partition(int[] arr,int low,int high){
        int i=low;
        int j=high;
        int key=arr[low];

        while(i<j){

            while(arr[j]>=key&&i<j){
                j--;
            }
            if(i<j){
                arr[i]=arr[j];
                i++;
            }
            while(arr[i]<=key&&i<j){
                i++;
            }
            if(i<j){
                arr[j]=arr[i];
                j--;
            }
        }
        arr[i]=key;

        return i;

    }

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int index=partition(arr,low,high);

            quickSort(arr,index+1,high);

            quickSort(arr,low,index-1);

        }


    }


    public static void quickSort(int[] arr){
        int low=0;
        int high=arr.length-1;
        quickSort(arr,low,high);


    }

    public static void main(String[] args) {
        //给出无序数组
        int[] arr={72,6,57,88,60,4,83,73,48,85};

        //输出无序数组
        System.out.println(Arrays.toString(arr));

        //快速排序
        quickSort(arr);

        //输出有序数组
        System.out.println(Arrays.toString(arr));

    }
}
