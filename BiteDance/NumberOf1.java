package BiteDance;
/*
*
输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
* */
public class NumberOf1 {//从低位到高位检测1的个数
    public int soluttion(int n){
        int count=0;
        while(n!=0){
            n&=(n-1);
            count++;
        }
        return count;

    }
}

