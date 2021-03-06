package BiteDance;

import java.util.Arrays;
/*
* 冒泡排序法
* */
public class BubbleSort {
    public static int[] bubbleSort(int[] array){
        if(array.length==0){
            return array;
        }
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array=new int[]{4,5,6,3,2,1};
        int [] result=BubbleSort.bubbleSort(array);
        System.out.println(Arrays.toString(result));
    }

}
