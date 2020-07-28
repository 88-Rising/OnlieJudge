package BiteDance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
/*
* 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
* */
public class GetLeastNumbers_Solution {

    public ArrayList<Integer> getLeastNumbers_Solution(int[] intput,int k ){

        ArrayList<Integer> result=new ArrayList<>();
        if(intput.length==0){
            return result;
        }
        if(k>intput.length){
            return result;
        }

        Arrays.sort(intput);
        for(int i=0;i<k;i++){
            result.add(intput[i]);
        }
        return result;
    }

    public ArrayList<Integer> getLeastNumbers_Solution1(int [] input,int k){
        ArrayList<Integer> result=new ArrayList<>();
        if(input==null||input.length<k||k<=0){
            return result;
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());//使用优先队列来实现最大堆。需要设置比较器为逆序
        for(int i=0;i<input.length;i++){
            if(i<k){
                queue.add(input[i]);//最大堆会自动进行排序
            }else{
                if(input[i]<queue.peek()){//如果数组值小于堆顶值
                    queue.poll();//删除堆顶值
                    queue.add(input[i]);//加入数组值然后进行重新排序
                }
            }

        }
        for(int i=0;i<k;i++){
            result.add(queue.poll());//保存堆中元素到结果集中
        }
        return result;

    }


}
