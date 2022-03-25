public class Main {
    public static void main(String[] args) {
        Solution_02 solution_02 = new Solution_02();
        int[] nums = {2, 7, 11, 15};
        int[] input = solution_02.twoSum(nums, 9);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}
