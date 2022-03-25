public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0){
            return 0;
        }
        StringBuffer stringBuffer = new StringBuffer(haystack);
        return stringBuffer.indexOf(needle);
    }
}
