public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(2, null);
        ListNode listNode1 = new ListNode(1, listNode);
        ListNode listNode2 = new ListNode(1, listNode1);
        ListNode head = new ListNode(1,listNode2);
        Solution solution = new Solution();
        ListNode newHead = solution.deleteDuplicates(head);
    }
}
