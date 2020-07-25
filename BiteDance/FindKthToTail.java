package BiteDance;

import java.util.List;
/*
* 输入一个链表，输出该链表中倒数第k个结点
* */
public class FindKthToTail {

    public ListNode solution(ListNode head,int k){
        if(head==null || k==0){
            return null;
        }

        ListNode fast=head;
        ListNode slow=head;

        while(k>0&&fast!=null){
            fast=fast.next;
            k--;

        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return k>0? null:slow;
    }
}
