package BiteDance;


/*
* 给出一个单链表，返回删除单链表的倒数第 K 个节点的链表。
* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findAndDelLastKNode {

    public static class Node {

        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node removeLastKthNode(Node head, int lastKth) {
        if (head == null || lastKth < 1) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && lastKth > 0) {
            fast = fast.next;
            lastKth--;
        }
        if (lastKth == 1) {
            head = head.next;
        } else if (lastKth == 0) {
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
        }
        return head;
    }

    public static Node listGenerator(int length, String[] numbers) {
        Node head = new Node(Integer.parseInt(numbers[0]));
        Node cur = head;
        for (int i = 1; i < length; i++) {
            cur.next = new Node(Integer.parseInt(numbers[i]));
            cur = cur.next;
        }
        cur.next = null;
        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.value +" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] parameters = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(parameters[0]);
        int k = Integer.parseInt(parameters[1]);
        String[] numbers = bufferedReader.readLine().split(" ");
        Node head = listGenerator(n, numbers);
        head = removeLastKthNode(head, k);
        printList(head);
    }
}