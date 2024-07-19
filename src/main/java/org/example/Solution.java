package org.example;

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 1; i <= nums.length; i++) {
            sum += i;
        }
        for (int here : nums) {
            sum -= here;
        }
        return (sum == 0) ? 0 : sum;
    }
}
