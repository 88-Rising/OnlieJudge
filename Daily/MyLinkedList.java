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

    public static void main(String[] args) {
        Node head=null;
        head = pushFront(head,1);
        head = pushFront(head,2);
        head = pushFront(head,3);
        display(head);

    }
}
