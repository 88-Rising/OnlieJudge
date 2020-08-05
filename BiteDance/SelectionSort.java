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
    //插入排序
    public static void insertSort(int [] array){
        for(int i=1;i<array.length;i++){
            int insertVal=array[i];
            int index=i-1;
            while(index>=0&&array[index]>insertVal){
                array[index+1]=array[index];
                index--;
            }
            array[index+1]=insertVal;

        }

    }
    //希尔排序
    public static void shellSort(int[] array){
        int dk=array.length/3+1;
        while(dk>1){
            shellSorting(array,dk);
            dk=dk/3+1;
        }
    }
    public static void shellSorting(int[] array,int dk){
        for(int i=dk;i<array.length;i++){
//            if(array[i]<array[i-dk]){
                int insertVal=array[i];
                int index=i-dk;
//                array[i]=array[i-dk];
//                while(index>=0&&array[index]>insertVal){
//                    array[index+dk]=array[index];
//                    index-=dk;
//                }
//                array[index+dk]=insertVal;
//            }
            while(index>=0&&array[index]>insertVal){
                array[index+dk]=array[index];
                index-=dk;
            }
            array[index+dk]=insertVal;
        }

    }
    public static void main(String[] args) {
        int[] array=new int[]{9,5,2,3,6,4,78,1,5,68,64,52,31};
        System.out.println(Arrays.toString(array));
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
