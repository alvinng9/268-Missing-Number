package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void missingNumberTest() {
        Solution solution = new Solution();
        assertEquals(2, solution.missingNumber(new int[]{3,0,1}));
        assertEquals(2, solution.missingNumber(new int[]{0,1}));
        assertEquals(8, solution.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        assertEquals(6, solution.missingNumber(new int[]{9,8,4,2,3,5,7,0,1}));
        assertEquals(5, solution.missingNumber(new int[]{9,6,4,2,3,8,7,0,1}));
    }
}