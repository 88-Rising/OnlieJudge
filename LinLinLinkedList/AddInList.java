package LinLinLinkedList;

import java.util.ArrayList;
//两个链表生成相加链表
public class AddInList {
//    public ListNode addInList (ListNode head1, ListNode head2) {
//        if(head1==null){
//            return head2;
//        }
//        if(head2==null){
//            return head1;
//        }
//        ListNode l1=reverseList(head1);
//        ListNode l2=reverseList(head2);
//        ListNode result=new ListNode(0);
//        int c=0;
//        while(l1!=null||l2!=null||c!=0){
//            int val1=l1!=null?l1.val:0;
//            int val2=l2!=null?l2.val:0;
//            int val=val1+val2+c;
//            c=val/10;
//            ListNode cur=new ListNode(val%10);
//            cur.next=result.next;
//            result.next=cur;
//            if(l1!=null){
//                l1=l1.next;
//            }
//            if(l2!=null){
//                l2=l2.next;
//            }
//        }
//        return result.next;
//
//    }
//
//    private ListNode reverseList(ListNode head) {
//
//        if(head==null){
//            return null;
//        }
//
//        ListNode newHead=null;
//        ListNode cur=head;
//        ListNode temp;
//        while(cur!=null){
//            temp=cur.next;
//            cur.next=newHead;
//            newHead=cur;
//            cur=temp;
//        }
//        return newHead;
//    }

    public ListNode addInList (ListNode head1, ListNode head2) {
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        ListNode l1=reverseList(head1);
        ListNode l2=reverseList(head2);
        ListNode result=new ListNode(0);
        int c=0;
        while(l1!=null||l2!=null||c!=0){
            int val1=l1!=null?l1.val:0;
            int val2=l2!=null?l2.val:0;
            int val=val1+val2+c;
            c=val/10;
            ListNode cur=new ListNode(val%10);
            cur.next=result.next;
            result.next=cur;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }

        }
        return result.next;
    }

    private ListNode reverseList(ListNode head) {

        if(head==null){
            return null;
        }

        ListNode newList=null;
        ListNode cur=head;
        ListNode temp;
        while(cur!=null){
            temp=cur.next;
            cur.next=newList;
            newList=cur;
            cur=temp;
        }
        return newList;
    }

    
}
