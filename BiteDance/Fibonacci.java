package BiteDance;

import java.util.HashMap;

/*
* 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列第n项
* */
public class Fibonacci {

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        int first=1;
        int second=1;
        int third=1;
        while(n>2){
            third=first+second;
            first=second;
            second=third;
            n--;

        }
        return third;
    }
    private HashMap<Integer,Integer> map=new HashMap<>();
    public  int fibonacci1(int n){
        if(n==0||n==1){
            return n;
        }
        int pre=0;
        if(map.containsKey(n-1)){
            pre=map.get(n-1);
        }else{
            pre=fibonacci1(n-1);
            map.put(n-1,pre);
        }
        int ppre=0;
        if(map.containsKey(n-2)){
            ppre=map.get(n-2);
        }else{
            ppre=fibonacci1(n-2);
            map.put(n-2,ppre);

        }
        return pre+ppre;

    }
}
