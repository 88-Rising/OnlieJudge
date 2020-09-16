package Sorts;

public class selectionSort {
    /*
    * 思路：

找到数组中最大的元素，与数组最后一位元素交换

当只有一个数时，则不需要选择了，因此需要n-1趟排序，比如10个数，需要9趟排序

代码实现要点：

两个for循环，外层循环控制排序的趟数，内层循环找到当前趟数的最大值，随后与当前趟数组最后的一位元素交换
    *
    * */

    public static void sort(int[] nums){

        for(int i=0;i<nums.length-1;i++){
            int index=0;
            for(int j=0;j<nums.length-i;i++){
                if(nums[j]>nums[index]){
                    index=j;
                }
            }
            if(index!=nums.length-i-1){
                int temp=nums[index];
                nums[index]=nums[nums.length-i-1];
                nums[nums.length-i-1]=temp;
            }
        }


    }
}
