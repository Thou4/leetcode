public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //题目给出的链表没有头节点
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        //先排除链表为空的情况
        if (head == null){
            return head;
        }
        ListNode cur = head;
        ListNode index = newHead;
        index.next = null;
        while (cur != null){
            if (cur.val != val){
                index.next = cur;
                index = cur;
                cur = cur.next;
                index.next = null;
                continue;
            }
            cur = cur.next;
        }
        return newHead.next;
    }
}

class ListNode {
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
}