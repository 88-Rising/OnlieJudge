package Sorts;
/*
* （1）将元素通过步长分组，组内用直接插入排序使其有序

（2）随着步长逐渐减小，每个分组的记录数越来越多，当步长减为1时，所有记录合成一组，所有记录有序
*
* */
public class ShellSort {

    public static void shell(int[] nums){

        int dk=nums.length/3+1;
        while(dk>1){
            shellSorting(nums,dk);
            dk=dk/3+1;
        }

    }

    private static void shellSorting(int[] nums, int dk) {
        for(int i=dk;i<nums.length;i+=dk){
            int temp=nums[dk];
            int indx=i-dk;
            while(indx>=0&&nums[indx]>temp){
                nums[indx+dk]=nums[indx];
                indx-=dk;
            }
            nums[indx+dk]=temp;
        }

    }
}
