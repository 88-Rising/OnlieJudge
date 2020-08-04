package BiteDance;

import java.util.Arrays;
//归并排序

public class MergeSort {

    public static void merge(int[] array,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=high){
            if(array[i]<array[j]){
                temp[k++]=array[i++];
            }else{
                temp[k++]=array[j++];
            }
        }
        while(i<=mid){
            temp[k++]=array[i++];
        }
        while(j<=high){
            temp[k++]=array[j++];
        }

        for(int x=0;x<temp.length;x++){

            array[x+low]=temp[x];
        }


    }

    public static void sort(int[] array,int low,int high){
        int mid=(low+high)/2;

        if(low<high){
            sort(array,low,mid);
            sort(array,mid+1,high);
            merge(array,low,mid,high);
        }else{
            return;
        }

    }

    public static void mergeSort(int [] array){
        int low=0;
        int high=array.length-1;
        sort(array,low,high);

    }

    public static void main(String[] args) {
        int[] array=new int[]{5,6,8,9,2,3,5,4};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
