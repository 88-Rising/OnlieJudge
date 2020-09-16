package Sorts;

public class quickSort {

    public static void quickSorting(int[] nums){
        int left=0;
        int right=nums.length-1;
        quickSorting(nums,left,right);
    }
    public static void quickSorting(int[] nums,int left,int right){
        if(left<right){
            int index=partition(nums,left,right);
            quickSorting(nums,index+1,right);
            quickSorting(nums,left,index-1);

        }
    }
    private static int partition(int[] nums, int left, int right) {
        int key=nums[left];
        while(left<right){
            while(left<right&&key<=nums[right]){
                right--;
            }
            if(left<right&&key>nums[right]){
                nums[left]=nums[right];
                left++;
            }
            while(left<right&&key>=nums[left]){
                left++;
            }
            if(left<right&&key<nums[left]){
                nums[right]=nums[left];
                right--;
            }

        }
        nums[left]=key;
        return left;
    }

}
