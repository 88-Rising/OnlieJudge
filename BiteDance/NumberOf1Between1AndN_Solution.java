package BiteDance;
/*
* 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
* ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
*
* */
public class NumberOf1Between1AndN_Solution {

    public static int NumberOf1Between1AndN_Solution1(int n) {
        int count=0;
        int temp;
        int key;
        for(int i=1;i<=n;i++){
             key=i;
            while(key>0){
                temp=key%10;
                if(temp==1){
                    count++;
                }
                key=key/10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int k=NumberOf1Between1AndN_Solution1(11);
        System.out.println(k);
    }
}
