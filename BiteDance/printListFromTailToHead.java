package BiteDance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
* 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
* */
public class printListFromTailToHead {

    public ArrayList<Integer> solution(ListNode listnode){//借助栈来解决

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

    public ArrayList<Integer> solution1(ListNode listnode){//逆置数组

        ArrayList<Integer> list=new ArrayList<>();
        while(listnode!=null){
            list.add(listnode.val);
            listnode=listnode.next;
        }

        int i=0;
        int j=list.size()-1;
        while(i<j){
            Integer temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        return list;


    }
}
