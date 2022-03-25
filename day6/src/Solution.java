import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Object> stack = new Stack<>();
        int length = s.length();
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');
        //如果字符串只有一个括号直接返回false
        if (s.length() % 2 == 1){
            return false;
        }
        for (int i = 0; i < length; i++) {
            char index = s.charAt(i);
            //判断字符是不是hashMap里面的值 是的话说明是左括号则直接放入栈中
            //否则index是右括号则判断栈是否为空 以及栈顶的左括号是不是它在hashMap里对应的键
            if (hashMap.containsValue(index)){
                stack.push(index);
            }else {
                if (stack.isEmpty() || (stack.peek() != hashMap.get(index))){
                    return false;
                }
                //匹配成功 弹出栈顶的左括号
                stack.pop();
            }
        }
        //如果循环结束后还没返回false且栈已空则字符串有效
        return stack.isEmpty();
    }
}
