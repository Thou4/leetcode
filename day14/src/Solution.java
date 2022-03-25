public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode index = head.next;
        ListNode cur = head;
        while(index !=null) {
            if(index.val == cur.val) {
                cur.next = index.next;
                index = cur.next;
            }
            else if(index.val != cur.val) {
                cur=index;
                index = index.next;
            }
        }
        return head;
    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }