import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public String reverseVowels(String s) {
        Stack<Character> characters = new Stack<>();
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' || chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                characters.add(chars[i]);
            }
        }
        for (int i = 0; i < length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' || chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                chars[i] = characters.pop();
            }
        }
        return new String(chars);
    }
}
