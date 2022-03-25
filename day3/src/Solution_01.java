public class Solution_01 {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String input = String.valueOf(x);
        char[] former = input.toCharArray();
        int length = former.length;
        for (int i = 0; i < length/2; i++) {
            char temp = former[i];
            former[i] = former[length - i - 1];
            former[length - i - 1] = temp;
        }
        String latter = new String(former);
        return latter.equals(input);
    }
}
