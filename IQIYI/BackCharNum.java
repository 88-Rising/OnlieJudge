package IQIYI;

import java.util.Scanner;
/*
*
* 如果一个整数只能被1和自己整除,就称这个数是素数。
如果一个数正着反着都是一样,就称为这个数是回文数。例如:6, 66, 606, 6666
如果一个数字既是素数也是回文数,就称这个数是回文素数
牛牛现在给定一个区间[L, R],希望你能求出在这个区间内有多少个回文素数。
*
* */

public class BackCharNum {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int left=scanner.nextInt();
        int right=scanner.nextInt();
        int res=0;
        if(left==1){
            left++;
        }
        while(left<=right){
            if(isPrime(left)&&IsReverse(left)){
                res++;
            }
            left++;
        }
        System.out.println(res);

    }

    private static boolean IsReverse(int left) {
        String strings=String.valueOf(left);
        int i=0;
        int j=strings.length()-1;
        while(i<=j){
            if(strings.charAt(i)!=strings.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    private static boolean isPrime(int left) {
        for(int i=2;i<=left/2;i++){
            if(left%i==0){
                return false;
            }
        }
        return true;
    }
}
