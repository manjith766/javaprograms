package com.neoteric.Arrays;

public class SecondLargestArray {
    public static void main(String[] args) {
        int [] nums = {20,40,76,20,50};
        int max1 = nums [0];
        int max2 = Integer.MIN_VALUE;
        for(int n : nums){
            if (n > max1) {
                max2 = max1;
                max1 = n;
            }else if (n > max2 && n != max1){
                max2 = n;

            }
        }
        System.out.println(max2);

    }
}
