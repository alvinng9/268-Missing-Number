package org.example;

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        //find the sum of numbers from 1 to nums.length + 1
        for (int i = 1; i <= nums.length; i++) {
            sum += i;
        }

        //subtract all nums from the given array from the sum found above
        //the remaining is the missing number
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}
