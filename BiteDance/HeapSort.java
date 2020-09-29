package BiteDance;


import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] array){
        heapInsert(array);
        int size=array.length;
        while (size>1){
            swap(array,0,size-1);
            size--;
            heapify(array,0,size);
        }
    }


    private static void heapInsert(int[] array) {
        for(int i=0;i<array.length;i++){
            int currentIndex=i;
            int fatherIndex=(currentIndex-1)/2;

            while(array[currentIndex]>array[fatherIndex]){
                swap(array,currentIndex,fatherIndex);
                currentIndex=fatherIndex;
                fatherIndex=(currentIndex-1)/2;
            }
        }
    }
    private static void heapify(int[] array, int index, int size) {
        int left=2*index+1;
        int right=2*index+2;
        while(right<=size){
            int largestIndex;

            if(array[left]<array[right]&&right<size){
                largestIndex=right;
            }else{
                largestIndex=left;
            }

            if(array[index]>array[largestIndex]){
                largestIndex=index;
            }
            if(index==largestIndex){
                break;
            }
            swap(array,largestIndex,index);
            index=largestIndex;
            left=2*index+1;
            right=2*index+2;
        }

    }
    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }

    public static void main(String[] args) {
        int[] array=new int[]{8,7,6,3,5};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
