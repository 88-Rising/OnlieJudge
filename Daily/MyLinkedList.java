package Daily;

class Node{
    public int val;
    public Node next=null;
    public Node(int val){
        this.val=val;
    }
}
public class MyLinkedList {

    public static Node  pushFront(Node head,int val){
        Node newNode =new Node(val);
        newNode.next=head;
        return newNode;

    }
}
