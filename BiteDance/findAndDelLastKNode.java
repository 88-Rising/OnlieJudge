package BiteDance;


/*
* 给出一个单链表，返回删除单链表的倒数第 K 个节点的链表。
* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findAndDelLastKNode {
    public static void printLinkedList(ListNode head){
        ListNode cur=head;
        while(cur!=null){
            System.out.print(cur.val);
            cur=cur.next;
            System.out.print(" ");
        }

    }

    public static ListNode removeLastKNode(int k,ListNode head){
        if(k<1||head==null){
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(k>0&&fast.next!=null){
            fast=fast.next;
            k--;
        }
        if(k==1){
            head=head.next;
        }else if (k==0){
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }
        }
        slow.next=slow.next.next;
        return head;


    }

    public static ListNode listGenerator(int n,String[] linkedList){
        ListNode head=new ListNode(Integer.parseInt(linkedList[0]));
        ListNode cur=head;
        for(int i=1;i<linkedList.length;i++){
            cur.next=new ListNode(Integer.parseInt(linkedList[i]));
            cur=cur.next;
        }
        cur.next=null;
        return head;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String [] lineFirst=bufferedReader.readLine().split(" ");
        int n=Integer.parseInt(lineFirst[0]);
        int k=Integer.parseInt(lineFirst[1]);
        String[] linkedList=bufferedReader.readLine().split(" ");
        ListNode head=listGenerator(n,linkedList);
        ListNode result=removeLastKNode(k,head);
        printLinkedList(result);


    }
}