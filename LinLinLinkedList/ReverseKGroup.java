package LinLinLinkedList;
//链表中的节点每k个一组翻转
public class ReverseKGroup {
    public ListNode reverseKGroup (ListNode head, int k) {
        if(head==null||head.next==null||k<2){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy,cur=head,temp;
        int length=getLength(head);

        for(int i=0;i<length/k;i++){
            for(int j=1;j<k;j++){
                temp=cur.next;
                cur.next=temp.next;
                temp.next=pre.next;
                pre.next=temp;
            }
            pre=cur;
            cur=cur.next;
        }
        return dummy.next;
    }

    private int getLength(ListNode head) {
        if(head==null){
            return 0;
        }
        ListNode cur=head;
        int res=0;
        while(cur!=null){
            cur=cur.next;
            res++;
        }
        return res;
    }
}
