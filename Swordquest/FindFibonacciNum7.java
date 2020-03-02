package Swordquest;

import Daily.FindNums;

public class FindFibonacciNum7 {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int a=1,b=1,c=0;
        if(n>=3){
            for(int i=3;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        FindFibonacciNum7 ff=new FindFibonacciNum7();
        System.out.println(ff.Fibonacci(3));
    }
}
