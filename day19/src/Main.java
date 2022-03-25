public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(3, null);
        ListNode listNode1 = new ListNode(3, listNode);
        ListNode listNode2 = new ListNode(1, listNode1);
        System.out.println(solution.isPalindrome(listNode2));
    }
}
