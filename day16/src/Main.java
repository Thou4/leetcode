public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(7,null);
        ListNode listNode1 = new ListNode(7, listNode);
        ListNode head = new ListNode(0, listNode1);
        Solution solution = new Solution();
        solution.removeElements(head,7);
    }
}
