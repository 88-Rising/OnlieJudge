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
        for(Node cur=head;cur.next!=null;cur=cur.next){
            System.out.printf("(%d)->",cur.val);
        }
        System.out.print("null%n");
    }

    public static Node  pushFront(Node head,int val){
        Node newNode =new Node(val);
        newNode.next=head;
        return newNode;

    }
}
