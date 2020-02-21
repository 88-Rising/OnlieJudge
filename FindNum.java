

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str01 = (str.replace("[", "").
                replace("]", "")).split(",");
        int[] nums = new int[str01.length];
        List list=new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(str01[i]);
        }
        Arrays.sort(nums);
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]!=nums[j+1]){
                list.add(nums[j]);

            }
        }
        list.add(nums[nums.length-1]);
//        for(int i = 0;i < list.size();i++){
//            System.out.println(list.get(i));
//        }
//       if(list.size()<2){
//           System.out.println(-1);
//       }else{
//           System.out.println(list.get(list.size()-3));
//       }

        if(nums.length<2){
            System.out.println(-1);
        }else{
            System.out.println(nums[nums.length-3]);
        }
    }

}

