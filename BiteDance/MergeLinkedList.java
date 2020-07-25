package BiteDance;

public class MergeLinkedList {

    public ListNode merge(ListNode list1,ListNode list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        ListNode newHead= new ListNode(0);
        ListNode cur=newHead;
        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
                cur.next=list2;
                list2=list2.next;
            }else{
                cur.next=list1;
                list1=list1.next;
            }
            cur=cur.next;
        }
        cur.next=list1==null?list2:list1;
        return newHead.next;
    }
}
