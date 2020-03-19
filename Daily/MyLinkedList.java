package Daily;

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
    }
}
