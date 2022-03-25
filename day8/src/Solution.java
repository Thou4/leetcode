import java.util.Stack;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;//新数组长度
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = length - 1; i >= 0; i--) {
            if (stack.isEmpty()){
                stack.push(nums[i]);
            }
            if (nums[i] != stack.peek()){
                stack.push(nums[i]);
            }
        }
        while (!stack.isEmpty()){
            nums[k] = stack.pop();
            k++;
        }
        return k;
    }
}
