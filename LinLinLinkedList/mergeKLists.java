package LinLinLinkedList;

import java.util.ArrayList;
//合并k个有序链表
public class mergeKLists {
    public ListNode mergeList(ListNode listNode1,ListNode listNode2){
        if(listNode1==null){
            return listNode2;
        }
        if(listNode2==null){
            return listNode1;
        }
        ListNode result=new ListNode(0);
        ListNode cur=result;
        while(listNode1!=null&&listNode2!=null){
            if(listNode1.val<listNode2.val){
                cur.next=listNode1;
                cur=cur.next;
                listNode1=listNode1.next;
            }else{
                cur.next=listNode2;
                cur=cur.next;
                listNode2=listNode2.next;
            }
        }
        cur.next=listNode1==null?listNode2:listNode1;
        return result.next;

    }

    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if(lists.size()<1||lists==null){
            return null;
        }
        if(lists.size()==1){
            return lists.get(0);
        }
        if(lists.size()%2!=0){
            lists.add(null);
        }

        ArrayList<ListNode> sum=new ArrayList<>();
        for(int i=0;i<lists.size();i+=2){
            sum.add(mergeList(lists.get(i),lists.get(i+1)));
        }
        return mergeKLists(sum);

    }
}
