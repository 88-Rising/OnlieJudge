package BiteDance;

import java.util.Arrays;
import java.util.HashMap;

/*
*数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组
{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
* */
public class MoreThanHalfNum_Solution {

    public static int solution(int[] array){
        if(array==null){
            return 0;
        }

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                int count=map.get(array[i]);
                count++;
                map.put(array[i],count);
            }else{
                map.put(array[i],1);

            }
            if(map.get(array[i])>array.length/2){
                return array[i];
            }
        }
        return 0;
    }
    public static int solution1(int[] array){
        if(array==null){
            return 0;
        }

        Arrays.sort(array);

        int target=array[array.length/2];
        int count=0;
        for(int i=0;i<array.length;i++){
            if(target==array[i]){
                count++;
            }
            if(count>array.length/2){
                return target;
            }
        }
        return 0;
    }

}
