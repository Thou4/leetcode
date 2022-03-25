public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode();
        ListNode cur = head;
        ListNode p = null;
        while (cur != null){
            newHead.next = cur;
            cur = cur.next;
            newHead.next.next = p;
            p = newHead.next;
        }
        return newHead.next;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}