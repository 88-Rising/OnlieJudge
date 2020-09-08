package JavaOnlineJudge;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class ReverseList {
        public ListNode reverseList(ListNode head){
            if(head==null){
                return null;
            }

            ListNode newList=null;
            ListNode cur=head;
            ListNode temp=null;
            while(cur!=null){
                temp =cur.next;
                cur.next=newList;
                newList=cur;
                cur=temp;
            }
            return newList;
        }

}
