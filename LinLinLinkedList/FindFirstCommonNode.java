package LinLinLinkedList;

public class FindFirstCommonNode {
    public int getLinkedListLength(ListNode listNode){
        if(listNode==null){
            return 0;
        }
        int result=0;
        while(listNode!=null){
            result++;
            listNode=listNode.next;
        }
        return result;
    }

    public ListNode findFirstCommonNode(ListNode pHead1,ListNode pHead2){
        if(pHead1==null||pHead2==null){
            return null;
        }
        int length1=getLinkedListLength(pHead1);
        int length2=getLinkedListLength(pHead2);
        int step=0;
        if(length1>length2){
            step=length1-length2;
            while(step>0){
                pHead1=pHead1.next;
                step--;
            }
        }else{
            step=length2-length1;
            while(step>0){
                pHead2=pHead2.next;
                step--;
            }
        }
        while(pHead1!=null&&pHead2!=null){
            if(pHead1.val==pHead2.val){
                return pHead1;
            }
            else{
                pHead1=pHead1.next;
                pHead2=pHead2.next;
            }
        }
        return null;
    }

}
