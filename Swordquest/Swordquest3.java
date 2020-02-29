package Swordquest;

import java.util.ArrayList;
import java.util.Stack;

class ListNode{
    int val;
    ListNode next;

    public ListNode (int val){
        this.val=val;
    }
}
/*
* 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
* */
public class Swordquest3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }

        ArrayList<Integer> list= new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());

        }
        return list;


    }
}
