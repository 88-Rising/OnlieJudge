package LinLinLinkedList;

import java.util.ArrayList;
//请判断一个链表是否是一个回文结构
public class IsPail {
    public boolean isPail (ListNode head) {
        if(head==null){
            return false;
        }

        ArrayList<ListNode> lists=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null){
            lists.add(cur);
            cur=cur.next;
        }
        int i=0;
        int j=lists.size()-1;
        while(i<=j){
            if(lists.get(i).val!=lists.get(j).val){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
