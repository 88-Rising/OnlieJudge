package BiteDance;

public class ReverseList {

    public ListNode solution(ListNode head){
        if(head==null){
            return null;
        }

        ListNode newHead=null;
        ListNode cur=head;

        while(head!=null){
            cur=head.next;
            head.next=newHead;
            newHead=head;
            head=cur;
        }
        return newHead;
    }
}
