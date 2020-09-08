package BiteDance;

import java.util.ArrayList;
import java.util.Arrays;
//数组中相加为0的三元组

public class ThreeSum {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(num==null){
            return result;
        }
        Arrays.sort(num);
        int sum,left,right;
        for(int i=0;i<num.length-2;i++){
            if(i!=0 && num[i]==num[i-1]){
                continue;
            }
            left=i+1;
            right=num.length-1;
            while(left<right){
                sum=num[left]+num[right];
                if(sum+num[i]==0){
                    ArrayList<Integer> solution=new ArrayList<>();
                    solution.add(num[i]);
                    solution.add(num[left]);
                    solution.add(num[right]);
                    result.add(solution);
                    left++;
                    right--;
                    while(left<right&&num[left]==num[left-1]){
                        left++;
                    }
                    while(left<right&&num[right]==num[right+1]){
                        right--;
                    }
                }else if(sum+num[i]<0){
                    left++;
                }else {
                    right--;
                }

            }
        }
        return result;
    }

}
