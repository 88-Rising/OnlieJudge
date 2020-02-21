package Daily;

import java.util.Scanner;

public class FindMissNum {
//    public int findMissNum(int[] nums){
//
//
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String scan=sc.nextLine();
            String[] rs=(scan.replace("[","").replace("]","")).split(",");
            int[] nums=new int[rs.length];
            for(int i=0;i<rs.length;i++){
                nums[i]=Integer.parseInt(rs[i]);

            }
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]+1!=nums[j+1]){

                    System.out.println(nums[j]+1);
                    return;
                }

            }
        }
    }
}
