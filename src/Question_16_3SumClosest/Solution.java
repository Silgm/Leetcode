package Question_16_3SumClosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int distance=Integer.MAX_VALUE;
        int value=0;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i+1;
            int right=nums.length-1;
            while (left<right){
                int a = nums[i];
                int b = nums[left];
                int c= nums[right];
                if(a+b+c==target){
                    return target;
                }
                else {
                    if (Math.abs(a+b+c-target)<distance) {
                        distance=Math.abs(a+b+c-target);
                        value=a+b+c;
                    }
                    if(a+b+c>target){
                        right--;
                    }
                    else {
                        left++;
                    }
                }
            }
        }
        return value;
    }
}
