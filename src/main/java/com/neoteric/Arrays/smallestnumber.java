package com.neoteric.Arrays;

/*find the smallest number in array?
lets follow the for step method
understand - analyse - build logic - write java code..
QUESTION 2 — Find the smallest number in an array

We’ll follow the same 4-step method:
understand → analyse → build logic → write Java code

1. HOW TO UNDERSTAND THE QUESTION
The question:
“Find the minimum (smallest) value in the array.”
So:
Input: array → {12, 5, 7, 2, 9}
Output: smallest value → 2
Operation: compare each value
2. HOW TO ANALYSE THE PROBLEM
Ask yourself:
“How would I find the smallest number if these were written on paper?”
You would
Look at the first number
Treat it as the smallest
Compare it with the next number
If the new number is smaller → update
Continue until the last number
Bang — that’s the algorithm.
 3. LOGIC (in plain English)
Assume the first element is the smallest
Loop through each number
If any number is smaller → update
Print the smallest
 */

public class smallestnumber {
    public static void main(String[] args) {

        int[] nums = {2, 5, 7, 20};
        int min =nums[0];
        for(int n:nums){
            if (n<min){
                min =n;
            }
        }
System.out.println("smallest number"+min);

    }
}
