package Daily;

import java.util.Arrays;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//        你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/two-sum
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class CountNums {

        public int[] twoSum(int[] nums, int target) {
            int[] num=new int[2];
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        num[0]=i;
                        num[1]=j;
                        break;
                    }
                }
            }

            return num;
        }

    public static void main(String[] args) {
//        利用Array类中的toString方法
        int[] nums=new int[]{1,2,3,5,6,7};
        int target=9;
        CountNums cn=new CountNums();
        System.out.println(Arrays.toString(cn.twoSum(nums,9)));
    }

}
