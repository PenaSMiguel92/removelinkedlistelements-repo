public class ListNode { 
    int val; 
    ListNode next;

    ListNode() {
    }
    
    ListNode(int val) { 
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override 
    public String toString() {
        String val = "[";
        ListNode pointer = this;
        while (pointer != null) {
            val += " " + pointer.val + " ";
            pointer = pointer.next;
        }
        return val + "]";
    }
    
    public static ListNode generateList(int[] values) {
        ListNode head = new ListNode(-1, null);
        ListNode pointer = head;
        for (int val : values) {
            pointer.next = new ListNode(val);
            pointer = pointer.next;
        }
        return head.next;
    }
} 
