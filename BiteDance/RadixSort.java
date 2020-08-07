package BiteDance;

import java.util.Arrays;

public class RadixSort {

    public static void radixSort(int[] array){
        if(array.length==0){
            return;
        }
        int maxValue=getMax(array);
        int loop=0;
        while(maxValue>0){
            loop++;
            maxValue/=10;
        }
        int n=1;
        int k=0;
        int[][] bucket=new int[10][array.length];
        int[] order=new int [array.length];

        while(n<=loop){

            for(int num:array){
                int digit=(num/n)%10;
                bucket[digit][order[digit]]=num;
                order[digit]++;
            }
            for(int i=0;i<10;i++){
                if(order[i]!=0){
                    for(int j=0;i<order[i];j++){
                        array[k++]=bucket[i][j];
                    }
                }
                order[i]=0;
            }
            n*=10;
            k=0;
        }

    }

    private static int getMax(int[] array) {
        for(int i=1;i<array.length;i++){
            int insertVal=array[i];
            int index=i-1;

            while(index>=0&&array[index]>insertVal){
                array[index+1]=array[index];
                index--;
            }
            array[index+1]=insertVal;
        }
        int result=array[array.length-1];
        return result;
    }

    public static void main(String[] args) {
        int[] array=new int[]{73,22,93,43,55,14,28,65,39,81,99};
        System.out.println(Arrays.toString(array));
        radixSort(array);
        System.out.println(Arrays.toString(array));

    }
}
