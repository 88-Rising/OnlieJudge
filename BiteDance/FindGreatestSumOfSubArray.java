package BiteDance;

/*
* 最大连续子序列的和
* */
public class FindGreatestSumOfSubArray {
/*
*
* //定义状态# f(i): 以i下标结尾的最大连续子序列的和
* //状态递推：f(i) = max(f(i-1)+array[i], array[i]) 【这里一定要注意连续关键字】
* 状态初始化：f(0) = array[0], max = array[0] //以[-2,-3,4,-1,-2,1,5,-3]为例,可以发现,
* //dp[0] = -2
* //dp[1] = -3
* //dp[2] = 4
* //dp[3] = 3
* //以此类推,会发现: dp[i] = max{dp[i-1]+array[i],array[i
* */
    public int  findGreatestSumOfSubArray(int[] array){
        int[] dp=new int[array.length];

        dp[0]=array[0];
        int maxValue=array[0];

        for(int i=1;i<array.length;i++){

            dp[i]=Math.max(dp[i-1]+array[i],array[i]);

            if(dp[i]>maxValue){
                maxValue=dp[i];
            }
        }
        return maxValue;
    }
}
