package Sorts;

public class straightInsertionSort {

    public static void sort(int[] nums){

        for(int i=1;i<nums.length;i++){
            int temp=nums[i];
            int index=i-1;
            while(i>=1&&nums[index]>temp){
                nums[i]=nums[index];
                index--;
            }
            nums[index+1]=temp;
        }

    }
}
