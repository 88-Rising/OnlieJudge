package FirstDay;

import java.util.Arrays;
import java.util.Scanner;

public class FindApple {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        int[] appleHeap=new int[nums];
        int temp=0;
        int sum=0;
        for(int i=0;i<nums;i++){
             temp=sc.nextInt();
             sum+=temp;
             appleHeap[i]+=sum;
        }
        int Qnums=sc.nextInt();
        int[] findApple=new int[Qnums];
        for(int j= 0;j<Qnums;j++){
            findApple[j]=sc.nextInt();
            int k= Arrays.binarySearch(appleHeap,findApple[j]);
            if(k>0){

            System.out.println(k+1);
            }else{
                System.out.println(-k);
            }
        }


    }
}
