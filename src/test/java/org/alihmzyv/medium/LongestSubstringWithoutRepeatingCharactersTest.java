package org.alihmzyv.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters service = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void lengthOfLongestSubstringTest1() {
        String s = "pwwkew";
        int actualResult = service.lengthOfLongestSubstring(s);
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
    }
}