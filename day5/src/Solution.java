public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String same = "";
        int length = strs.length;
        if (length == 1){//如果字符串数组只有一个字符串则直接输出这个字符串
            return strs[0];
        }
        for (int i = 1; i < length; i++) {
            char[] chars2 = strs[i].toCharArray();
            char[] chars1 = strs[i - 1].toCharArray();
            String temp = "";//用于记录每一轮循环前后两个字符串相同的前缀 并判断是否需要与same进行替换
            int min = chars2.length > chars1.length ? chars1.length : chars2.length;
            for (int j = 0; j < min; j++) {
                if (chars2[j] == chars1[j]){
                    temp = temp + chars1[j];
                }else{
                    break;//退出这轮for循环 进入下一轮for循环
                }
                }
                //1)条件需要不等于1的原因是第一轮循环时same是空字符串
                //2)temp要小于或等于same才能进行替换 这样same中就不会出现前面比较过的字符串没有的字符
                if (i != 1 && temp.length() <= same.length()){
                    same = temp;
                }else if (i == 1){
                    same = temp;
                }
        }
        return same;
    }
}
