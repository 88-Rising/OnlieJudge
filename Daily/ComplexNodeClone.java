package Daily;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class ComplexNodeClone {
    public RandomListNode Clone(RandomListNode pHead){
        if(pHead==null){
            return null;
        }

        RandomListNode cur=pHead;
        while(cur!=null){
            RandomListNode cloneNode=new RandomListNode(cur.label);
            cloneNode.next=cur.next;
            cur.next=cloneNode;
            cloneNode.random=null;
            cur=cloneNode.next;

        }

        cur=pHead;
        while(cur!=null){
            cur.next.random=cur.random==null?null:cur.random.next;
            cur=cur.next.next;
        }

        cur=pHead;
        RandomListNode pCloneHead=pHead.next;
        while(cur!=null){
            RandomListNode cloneNode=cur.next;
            cur.next=cloneNode.next;
            cloneNode.next=cloneNode.next==null?null:cloneNode.next.next;
            cur=cur.next;

        }
        return pCloneHead;

    }
}
