package question504;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/7/14 10:34
 **/
class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        String result = "";
        int numAbs = Math.abs(num);
        while (numAbs > 0) {
            result = (numAbs % 7) + result;
            numAbs = numAbs / 7;
        }
        if (num < 0) {
            return "-" + result;
        } else {
            return result;
        }
    }
}
