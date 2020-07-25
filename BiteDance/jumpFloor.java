package BiteDance;

import java.util.HashMap;

public class jumpFloor {

    public static int solution(int target){
        int first=1;
        int second=2;
        int third=target;

        while(target>2){
            third=first+second;
            first=second;
            second=third;
            target--;

        }
        return third;
    }
//    private HashMap<Integer,Integer> map= new HashMap<>();
    public int solution1(int target){

       return target;
    }
}
