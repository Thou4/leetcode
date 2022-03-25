import java.math.BigInteger;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        String num = "";
        ListNode listNode = head;
        while (listNode != null) {
            num = num + listNode.val;
            listNode = listNode.next;
        }
        if (num == ""){
            return false;
        }
        BigInteger num1 = new BigInteger(num);
        BigInteger temp = num1;
        BigInteger num2 = new BigInteger("0");
        BigInteger divisor = new BigInteger("10");
        while (!temp.add(divisor).equals(divisor)) {
            num2 = num2.multiply(divisor);
            num2 = num2.add((temp.divideAndRemainder(divisor))[1]);
            temp = temp.divide(divisor);
        }
        if (num1.compareTo(num2) != 0) {
            return false;
        }
        return true;
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