package LinLinLinkedList;
//对于一个给定的链表，返回环的入口节点，如果没有环，返回null

public class DetectCycle {

//    public ListNode detectCycle(ListNode head){
//        ListNode slow=head;
//        ListNode fast=head;
//
//        while(fast!=null&&fast.next!=null){//避免空指针异常
//            slow=slow.next;
//            fast=fast.next.next;
//
//            if(slow==fast){ //找到第一次相遇的位置
//                ListNode slow2=head;
//                while(slow!=slow2){ //再开启第三个指针 找到环的入口即 a=(n-1)(b+c)+c
//                    slow=slow.next;
//                    slow2=slow2.next;
//                }
//                return slow;
//            }
//
//
//        }
//        return null;
//    }
    public ListNode detectCycle(ListNode head){

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                ListNode slow2=head;
                while(slow2!=slow){
                    slow=slow.next;
                    slow2=slow2.next;
                }
                return slow;
            }

        }
        return null;

    }

}
