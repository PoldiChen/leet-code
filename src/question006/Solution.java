package question006;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/7/16 11:01
 **/
class Solution {

    private int getY(int k, int numRows) {
        int quotient = k / (numRows + numRows - 2);
        int remainder = k % (numRows + numRows - 2);
        if (remainder >= numRows) {
            return quotient * 2 + 1;
        } else {
            return quotient * 2;
        }
    }

    public String convert(String s, int numRows) {
        if (s.length() < 2) {
            return s;
        }
        if (numRows == 1) {
            return s;
        }
        if (numRows == 2) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if ((i % 2) == 0) {
                    sb1.append(s.charAt(i));
                } else {
                    sb2.append(s.charAt(i));
                }
            }
            return sb1.toString() + sb2.toString();
        }

        String result = "";
        String[][] arrs = new String[numRows][(s.length() / (numRows * 2 - 2 + 1)) * 2];

        int[] xArr = new int[numRows * 2 - 2];
        for (int i = 0; i < numRows; i++) {
            xArr[i] = i;
        }
        int temp = 0;
        for (int i = numRows - 2; i > 0; i--) {
            xArr[numRows+temp] = i;
            temp ++;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int x = xArr[i%(numRows * 2 - 2)];
            int y = getY(i, numRows);
            arrs[x][y] = String.valueOf(ch);
        }

        for (String[] arr : arrs) {
            for (String str : arr) {
                if (str != null) {
                    result += str;
                }
            }
        }

        return result;
    }
}
