package Daily;

import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Scanner;
//给定一个整数数组,判断其中是否有3个数和为N
public class FindNums {

    public String findNums(String[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] num=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            num[i]=Integer.parseInt(nums[i]);
            map.put(num[i],i);
        }
        for(int j=0;j<num.length;j++){
            int dif=target-num[j];
            for(int k=j+1;k<num.length;k++){
                int dif2=dif-num[k];
                if(map.get(dif2)!=null){
                  return "True";
                }
            }
        }
        return "False";
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//            String scan=sc.nextLine();
//            String[] tmpTest=scan.split(",");
//            String[] num=tmpTest[0].split(" ");
//            int nums=Integer.parseInt(tmpTest[1]);
//            FindNums fn=new FindNums();
//            String result=fn.findNums(num,nums);
//            System.out.println(result);
//        }
        Scanner sc=new Scanner(System.in);
        tag: while(sc.hasNext()){
            String scan=sc.nextLine();
            String[] temp=scan.split(",");
            String[] nums=temp[0].split(" ");
            int target=Integer.parseInt(temp[1]);
            HashMap<Integer,Integer> map=new HashMap<>();
            int[] num=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                num[i]=Integer.parseInt(nums[i]);
                map.put(num[i],i);
            }

            for(int j=0;j<num.length;j++){
                int dif=target-num[j];
                for(int k=j+1;k<num.length;k++){
                    int dif2=dif-num[k];
                    if(map.get(dif2)!=null){
                        System.out.println("True");
                        System.out.printf("j=%d,k=%d,last=%d",j,k,map.get(dif2));
                        break tag;
                    }
                }
            }
            System.out.println("False");
        }
    }
}
