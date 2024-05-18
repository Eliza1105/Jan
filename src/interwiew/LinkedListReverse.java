package interwiew;

public class LinkedListReverse {
    public static void main(String[] args) {
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(2);
        head.next.next = new ListNode1(3);
        head.next.next.next = new ListNode1(4);
        ListNode1 prev = null;
        ListNode1 curr = head;
        while (curr != null) {
            ListNode1 temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

    class ListNode {
        int val;
        ListNode1 next;

        ListNode(int val) {
            this.val = val;
        }
    }
