public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head1 = ListNode.generateList(new int[] { 1, 2, 6, 3, 4, 5, 6 });
        ListNode head2 = ListNode.generateList(new int[] {});
        ListNode head3 = ListNode.generateList(new int[] { 7, 7, 7, 7 });

        System.out.println(sol.removeElements(head1, 6));
        System.out.println(sol.removeElements(head2, 1));
        System.out.println(sol.removeElements(head3, 7));
    }


} 
