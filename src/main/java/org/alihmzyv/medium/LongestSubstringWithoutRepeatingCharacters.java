package org.alihmzyv.medium;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int max = s.isEmpty() ? 0 : 1;
        Map<Character, Integer> previousIndexByChar = new HashMap<>();
        int leftPointer = 0;
        int rightPointer = 0;
        for (; rightPointer < s.length(); rightPointer++) {
            char rightChar = s.charAt(rightPointer);
            Integer previousIndexOfRightChar = previousIndexByChar.get(rightChar);
            if (previousIndexOfRightChar != null && previousIndexOfRightChar >= leftPointer) {
                if ((rightPointer - leftPointer) > max) {
                    max = rightPointer - leftPointer;
                }
                leftPointer = previousIndexOfRightChar + 1;
            }
            previousIndexByChar.put(rightChar, rightPointer);
        }
        if ((rightPointer - leftPointer) > max) {
            max = rightPointer - leftPointer;
        }
        return max;
    }
}
