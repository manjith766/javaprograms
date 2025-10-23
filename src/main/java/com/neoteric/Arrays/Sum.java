package com.neoteric.Arrays;

public class Sum {
    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8};
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println(sum);
    }
}
