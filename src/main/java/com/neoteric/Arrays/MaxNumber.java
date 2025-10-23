package com.neoteric.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int[] nums = {10, 30, 20, 40};
        int max= nums[0];
        for (int n : nums) {
            if (n >max) {
                max = n;
            }
        }
        System.out.println("largest number "+max);
    }

}