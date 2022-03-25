public class Solution {
    public int addDigits(int num) {
        while (num > 9) {
            num = Solution.sum(num);
        }
        return num;
    }

    public static int sum(int num) {
        int age = 0;
        while (num > 0) {
            age = age + num % 10;
            num /= 10;
        }
        return age;
    }
}
