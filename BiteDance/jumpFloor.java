package BiteDance;

import java.util.HashMap;
/*
* 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算
不同的结果）。
* */
public class jumpFloor {

    public static int solution(int target){
        int first=1;
        int second=2;
        int third=target;

        while(target>2){
            third=first+second;
            first=second;
            second=third;
            target--;

        }
        return third;
    }
//    private HashMap<Integer,Integer> map= new HashMap<>();
    //动态规划：
    /*
    * 1.定义状态   f(n)：青蛙跳上第n个台阶的总跳法数
    * 2.编写状态转移方程  f(n)=f(n-1)+f(n-2)
    * 3.设置初始值
    * */
    public int solution1(int target){
        int [] dp=new int[target+1];
         dp[0]=1;
         dp[1]=1;

         for(int i=2;i<=target;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }


       return dp[target];
}
}
