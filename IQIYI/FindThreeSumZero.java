package IQIYI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindThreeSumZero {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] input=bf.readLine().split(" ");
        int[] nums=new int[input.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(input[i]);
        }
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int sum=0;
        for(int i=0;i<nums.length-2;i++){
            if(i!=0&&nums[i]==nums[i-1]){ //避免指针越界和重复计算
                continue;
            }
            left=i+1;
            right=nums.length-1;
            while(left<right){
                sum=nums[left]+nums[right];
                if(nums[i]+sum==0){
                    System.out.print(nums[i]+" ");
                    System.out.print(nums[left]+" ");
                    System.out.println(nums[right]);
                    left++;
                    right--;
                    while(left<right&&nums[left]==nums[left-1]){  //避免重复
                        left++;
                    }
                    while(left<right&&nums[right]==nums[right+1]){ //避免重复
                        right--;
                    }
                }else if(nums[i]+sum>0){
                    right--;
                }else if(nums[i]+sum<0){
                    left++;

                }

            }
        }

    }
}
