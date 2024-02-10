package org.alihmzyv.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest {
    ZigzagConversion zigzagConversion = new ZigzagConversion();

    @Test
    void convert() {
        String s = "AB";
        int numOfRows = 4;
        String expectedResult = "AB";
        String actualResult = zigzagConversion.convert(s, numOfRows);
        assertEquals(expectedResult, actualResult);
    }
}