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
        Stack<Integer> stack = new Stack<>(); //利用栈的先进后出的原则 从尾到头返回一个线性表
        while(listNode != null){  //判断结点中是否为空（无需设置头节点 一并进入判断）
            stack.push(listNode.val);//压栈
            listNode=listNode.next;
        }

        ArrayList<Integer> list= new ArrayList<>();
        while(!stack.isEmpty()){//判断栈中是否还有元素
            list.add(stack.pop());//出栈

        }
        return list;


    }
}
