package LinLinLinkedList;

public class RemoveNthFromEnd {
//删除链表的倒数第n个节点

    public ListNode removeNthFromEnd(ListNode head,int n){
       if(n<=0||head==null){
           return head;
       }

       ListNode fast=head;
       ListNode slow=head;
       while(n>0&&fast.next!=null){
           fast=fast.next;
           n--;
       }
       if(n==1){
           head=head.next;
       }else{
           while(fast.next!=null){
               fast=fast.next;
               slow=slow.next;
           }
           slow.next=slow.next.next;
       }

       return head;

    }
}
