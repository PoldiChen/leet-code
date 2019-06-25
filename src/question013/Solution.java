package question013;

import java.util.HashMap;
import java.util.Map;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/6/25 16:00
 **/
class Solution {

    public int romanToInt(String s) {

        Map<String, Integer> convertTwo = new HashMap<String, Integer>();
        convertTwo.put("IV", 4);
        convertTwo.put("IX", 9);
        convertTwo.put("XL", 40);
        convertTwo.put("XC", 90);
        convertTwo.put("CD", 400);
        convertTwo.put("CM", 900);

        Map<String, Integer> convertOne = new HashMap<String, Integer>();
        convertOne.put("I", 1);
        convertOne.put("V", 5);
        convertOne.put("X", 10);
        convertOne.put("L", 50);
        convertOne.put("C", 100);
        convertOne.put("D", 500);
        convertOne.put("M", 1000);

        int result = 0;
        while (s.length() > 0) {
            if (s.length() > 1 && convertTwo.containsKey(s.substring(0, 2))) {
                result += convertTwo.get(s.substring(0, 2));
                s = s.substring(2, s.length());
            } else {
                result += convertOne.get(s.substring(0, 1));
                s = s.substring(1, s.length());
            }
        }
        return result;
    }
}
