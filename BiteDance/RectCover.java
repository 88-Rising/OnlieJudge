package BiteDance;
/*
*我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。请问用n个 2*1 的小矩形无重叠地覆盖一个 2*n 的大矩
形，总共有多少种方法？
* */
public class RectCover {
    public static int solution(int target){
        int[] dp=new int[target+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=1;

        for(int i=3;i<=target;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[target];
    }
}
