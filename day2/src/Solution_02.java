public class Solution_02 {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == value && i != j) {
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
        }
        return output;
    }
}
