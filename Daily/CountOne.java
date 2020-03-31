package Daily;

import java.util.Scanner;
/*
* 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
* */
public class CountOne {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            num=num&(num-1);
            count++;
        }
        System.out.println(count);
    }
}
