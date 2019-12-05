package FirstDay;

//对于给定的正整数 n，计算其十进制形式下所有位置数字之和，并计算其平方的各位数字之和


import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {
       while(true) {
           Scanner sc = new Scanner(System.in);
           int a = sc.nextInt();
           int b = a * a;
           System.out.print(add(a));
           System.out.println("   " + add(b));
       }
    }
    public static int add(int n){
        int sum=0;
        while(n>0){
            int i=n%10;
            sum=sum+i;
         n=n/10;

        }

      return sum;
    }

}
