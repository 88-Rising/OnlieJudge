package BiteDance;

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
}
