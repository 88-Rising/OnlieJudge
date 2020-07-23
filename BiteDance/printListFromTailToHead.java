package BiteDance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
* 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
* */
public class printListFromTailToHead {

    public ArrayList<Integer> solution(ListNode listnode){

        Stack<Integer> stack=new Stack<>();
        while(listnode!=null){
            stack.push(listnode.val);
            listnode=listnode.next;
        }

        ArrayList<Integer> list=new ArrayList<>();
        while(!stack.empty()){
            list.add(stack.pop());
        }
        return list;


    }
}
