package BiteDance;

import java.util.Arrays;
//选择排序
public class SelectionSort {

    public static void selectionSort(int [] array){

        for(int i=0;i<array.length-1;i++){
            int lastNumIndex=0;
            for(int j=0;j<array.length-i;j++){
                if(array[j]>array[lastNumIndex]){
                    lastNumIndex=j;
                }
            }
            if(lastNumIndex!=array.length-1-i){
                int temp=array[lastNumIndex];
                array[lastNumIndex]=array[array.length-1-i];
                array[array.length-1-i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array=new int[]{9,5,2,3,6,4,78,1};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
