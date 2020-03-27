package Daily;

import com.sun.org.apache.regexp.internal.RE;

import java.lang.reflect.Array;
import java.util.*;

class Node{
    public int val;
    public Node next=null;
    public Node(int val){
        this.val=val;
    }
}
public class MyLinkedList {

    public static void display(Node head){
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.printf("(%d)->",cur.val);
        }
        System.out.print("null");
        System.out.println();
    }

    public static Node  pushFront(Node head,int val){
        Node newNode =new Node(val);
        newNode.next=head;
        return newNode;

    }

    public static Node getLast(Node head){
        if(head==null){
            return null;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        return cur;
    }

    public static Node pushBack(Node head,int val){
        Node newNode=new Node(val);
        if(head==null){
            return newNode;
        }
        Node last=getLast(head);
        last.next=newNode;
        return head;
    }
    public static Node reverseList(Node head){
        if(head==null){
            return null;
        }
        Node newList=null;
        Node cur=head;
        while(cur!=null){
         Node next=cur.next;
         cur.next=newList;
         newList=cur;
         cur=next;
        }
        return newList;
    }
    public static Node deleteNode(Node head,int val){
//        Node newlist=null;
//        Node cur=head;
//        while(cur!=null) {
//            Node next=cur.next;
//            Node last=null;
//            if(cur.val!=val) {
//                if(newlist==null) {
//                    cur.next=newlist;
//                    newlist=cur ;
//                }else {
//                    last=newlist;
//                    while(last.next!=null) {
//                        last=last.next;
//                    }
//                    last.next=cur;
//                    cur.next=null;
//                }
//            }
//            cur=next;
//        }
//        return newlist;
        Node sentinel = new Node(0);
        sentinel.next = head;

        Node prev = sentinel;
        Node curr = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            }
            else {
                prev = curr;
            }
            curr = curr.next;
        }
        return sentinel.next;


    }
    public static Node middleNode(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node FindKthToTail(Node head,int k) {//找出链表中倒数第K个节点
        Stack<Node> stack=new Stack<>();
        Node cur=head;
        int count=0;
        while(cur!=null){
            stack.push(cur);
            cur=cur.next;
            count++;
        }
        if(count<k){
            return null;
        }

        Node findNode=null;
        for(int i=0;i<k;i++){
           findNode=stack.pop();
        }

       return findNode;

    }
    public static Node FindKthToTail1(Node head,int k) {//快慢指针
        Node prev=head;
        Node slow=head;
        int count=0;
        int a=k;
        while(prev!=null){
            prev=prev.next;
            count++;
            if (k < 1) {
            slow=slow.next;
            }
            k--;
        }
        if(count<a){
            return null;
        }
        return slow;


    }
    public static Node mergeTwoLists(Node l1, Node l2) {
        Node prev=new Node(0);
        Node cur=prev;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                cur.next=l1;
                l1=l1.next;
            }else {
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        cur.next= l1==null?l2:l1;
        return prev.next;

    }
    public static Node ReverseList(Node head) {
        Node newList=null;
        Node cur=head;
        Node next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=newList;
            newList=cur;
            cur=next;
        }



        return newList;
    }

    public static Node ReverseList1(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        Node cur=head;
        Node newList=null;
        Node next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=newList;
            newList=cur;
            cur=next;

        }
        return newList;

    }
    public Node Merge(Node list1,Node list2) {
            Node FirstNode=new Node(0);
            Node cur=FirstNode;
            while(list1!=null&&list2!=null){
                if(list1.val>=list2.val){
                     cur.next=list2;
                    list2=list2.next;
                }else{
                     cur.next=list1;
                    list1=list1.next;
                }
                cur=cur.next;
            }
            cur.next= list1==null?list2:list1;
        return FirstNode.next;

    }
    public static int[] reOrderArray(int[] array) {
        ArrayList<Integer> jishu=new ArrayList<>();
        ArrayList<Integer> oushu=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                oushu.add(array[i]);
            }else{
                jishu.add(array[i]);
            }
        }
        int[] newArray=new int[array.length];
        int j=0;
        for(int i = 0;i<jishu.size();i++){
            array[j]=jishu.get(i);
            j++;
        }
        for(int k=0;k<oushu.size();k++){
            array[j]=oushu.get(k);
            j++;
        }
        return array;

    }

    public static void main(String[] args) {
        Node head=null;
        head = pushFront(head,1);
        head = pushFront(head,2);
        head = pushFront(head,3);
        display(head);
        head = pushBack(head,5);
        head = pushBack(head,6);
        display(head);
        head = reverseList(head);
        display(head);
        head=deleteNode(head,6);
        display(head);
        Node mid=middleNode(head);
        System.out.println(mid.val);
        Node findNode=FindKthToTail(head,2);
        System.out.println(findNode.val);
        Node head3 = null;
        head3 = pushFront(head3,2);
        head3 = pushFront(head3,1);
        head3 = pushFront(head3,0);
        Node head4=null;
        head4 = pushFront(head4,1);
        head4 = pushFront(head4,0);

        display(head3);
        Node head2 = mergeTwoLists(head3,head4);
        display(head2);
        Node head5=null;
        head5=ReverseList(head2);
        display(head5);

        int[] arr=new int[]{1,2,3,4,5};
        arr=reOrderArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



    }
}
