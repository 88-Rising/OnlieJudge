package SecondDay;

import java.util.Scanner;

public class NumSum{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){
                int n=sc.nextInt();
                int sum=sc.nextInt();
                int[] array=new int[n];
               for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
                System.out.println(bag(array,n,sum));
            }
        }
    public static long bag(int[] weight,int n,int sum){
        long dp[]=new long[sum+1];
        dp[0]=1;
        int i,j;
        for(i=0;i<n;i++){
            for(j=sum;j>=weight[i];j--){
                dp[j]=dp[j-weight[i]]+dp[j];
            }
        }
        return dp[sum];
    }

}
