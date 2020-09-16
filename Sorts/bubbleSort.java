package Sorts;
/*
* 思路：

俩俩交换，大的放在后面，第一次排序后最大值已在数组末尾。

因为俩俩交换，需要n-1趟排序，比如10个数，需要9趟排序

代码实现要点：

两个for循环，外层循环控制排序的趟数，内层循环控制比较的次数

每趟过后，比较的次数都应该要减1

优化：如果一趟排序后也没有交换位置，那么该数组已有序～
*
*
* */
public class bubbleSort {

    public static void sort(int[] nums){

        for(int i=0;i<nums.length-1;i++){
            boolean didSwap=false;
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    didSwap=true;
                }
            }
            if(didSwap==false){
                break;
            }
        }
    }

}
