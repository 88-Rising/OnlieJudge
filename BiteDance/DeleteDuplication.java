package BiteDance;
/*
* 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例
如，链表1->2->3->3->4->4->5 处理后为 1->2->5
* */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead==null){
            return null;
        }
        ListNode head=new ListNode(0);
        head.next=pHead;
        ListNode pre=head;
        ListNode last=pre.next;

        while(last!=null){

            if(last.next!=null&&(last.val==last.next.val)) {
                while(last.next!=null&&last.val==last.next.val) {
                    last = last.next;
                }
                last=last.next;
                pre.next=last;
            }else{
                last=last.next;
                pre=pre.next;
            }
        }
        return head.next;

    }
}
