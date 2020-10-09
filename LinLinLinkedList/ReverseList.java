package LinLinLinkedList;

import java.util.List;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }

}

public class ReverseList {

//    public ListNode reverseList(ListNode head){
//
//        if(head==null){
//            return null;
//        }
//
//        ListNode newList=null;
//        ListNode cur=head;
//
//        while(head!=null){
//            cur=head.next;
//            head.next=newList;
//            newList=head;
//            head=cur;
//        }
//        return newList;
//    }

    public ListNode reverseList(ListNode head){
        if(head==null){
            return null;
        }
        ListNode newList=null;
        ListNode cur=head;
        while(cur!=null){
            cur=head.next;
            head.next=newList;
            newList=head;
            head=cur;
        }
        return newList;

    }
}
