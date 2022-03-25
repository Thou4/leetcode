public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(2, null);
        ListNode listNode1 = new ListNode(1, listNode);
        solution.reverseList(listNode1);
    }
}
