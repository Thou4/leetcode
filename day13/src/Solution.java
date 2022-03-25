public class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                for (int j = i + 1; j < length; j++) {
                    digits[j] = 0;
                }
                return digits;
            }
        }
        int[] newNums = new int[length + 1];
        newNums[0] = 1;
        return newNums;
    }
}
