package BiteDance;
/*
*
* 输入两个链表，找出它们的第一个公共结点。
* （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
* */
public class FindFirstCommonNode {
    public int getLinkedListLength(ListNode root){
        int result=0;
        while(root!=null){
            root=root.next;
            result++;
        }
        return result;

    }
    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2){
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
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }

        return null;

    }
}
