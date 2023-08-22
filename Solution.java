public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ansPointer = new ListNode(-1, head);
        ListNode prevPointer = ansPointer;
        ListNode nextPointer = prevPointer.next;

        while (nextPointer != null) {
            if (nextPointer.val != val) {
                prevPointer.next = nextPointer;
                prevPointer = prevPointer.next;
            }

            nextPointer = nextPointer.next;
        }

        prevPointer.next = null;

        return ansPointer.next;
    }
} 
