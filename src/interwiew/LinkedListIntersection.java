package interwiew;

public class LinkedListIntersection {
    public static void main(String[] args) {

        ListNode1 headA = new ListNode1(4);
        headA.next = new ListNode1(1);
        headA.next.next = new ListNode1(8);
        headA.next.next.next = new ListNode1(4);
        headA.next.next.next.next = new ListNode1(5);

        ListNode1 headB = new ListNode1(5);
        headB.next = new ListNode1(0);
        headB.next.next = new ListNode1(1);
        headB.next.next.next = headA.next.next;

        ListNode1 ptrA = headA;
        ListNode1 ptrB = headB;
        while (ptrA != ptrB) {
            ptrA = ptrA == null ? headA : ptrA.next;
            ptrB = ptrB == null ? headB : ptrB.next;
        }
        System.out.println("Intersection node: " + ptrA.val);
    }
}
class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
    }
}
