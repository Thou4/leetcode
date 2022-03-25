import java.util.HashMap;

public class Solution_01 {

    public int romanToInt(String s) {
        HashMap hashmap = new HashMap();
        hashmap.put("I", 1);
        hashmap.put("V", 5);
        hashmap.put("X", 10);
        hashmap.put("L", 50);
        hashmap.put("C", 100);
        hashmap.put("D", 500);
        hashmap.put("M", 1000);
        int sum = 0;
        char[] roman = s.toCharArray();
        int length = roman.length;
        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                if (roman[i] == 'I' && roman[i + 1] == 'V') {
                    sum += 4;
                    i++;
                    continue;
                }
                if (roman[i] == 'I' && roman[i + 1] == 'X') {
                    sum += 9;
                    i++;
                    continue;
                }
                if (roman[i] == 'X' && roman[i + 1] == 'L') {
                    sum += 40;
                    i++;
                    continue;
                }
                if (roman[i] == 'X' && roman[i + 1] == 'C') {
                    sum += 90;
                    i++;
                    continue;
                }
                if (roman[i] == 'C' && roman[i + 1] == 'D') {
                    sum += 400;
                    i++;
                    continue;
                }
                if (roman[i] == 'C' && roman[i + 1] == 'M') {
                    sum += 900;
                    i++;
                    continue;
                }
            }
            sum = sum + (int) hashmap.get(roman[i] + "");
        }
        return sum;
    }
}
