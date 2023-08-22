public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null || head.next == null)
            return head;

        ListNode current = head;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        if (head.val == val) {
            head = head.next;
        }

        return head;
    }
} 
