package org.alihmzyv.medium;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        for (int rowNum = 0; rowNum < numRows; rowNum++) {
            int index = rowNum;
            int nextEnfOfZigZag;
            while (index < s.length()) {
                char ch = s.charAt(index);
                sb.append(ch);
                nextEnfOfZigZag = ((index / (numRows - 1)) + 1) * (numRows - 1);
                index += (nextEnfOfZigZag - index) * 2;
            }
        }
        return sb.toString();
    }
}
