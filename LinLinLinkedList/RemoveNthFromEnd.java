package LinLinLinkedList;

public class RemoveNthFromEnd {
//删除链表的倒数第n个节点

    public ListNode removeNthFromEnd(ListNode head,int n){
        if(head==null||n<=0){
            return head;
        }

        ListNode fast=head;
        ListNode slow=head;
        while(n>0&&fast.next!=null){
            fast=fast.next;
            n--;
        }
        if(n==1){
            return head;
        }else if(n==0){
            while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            }
            slow.next=slow.next.next;
        }


        return slow;

    }
}
