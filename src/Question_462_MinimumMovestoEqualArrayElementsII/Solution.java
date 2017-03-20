package Question_462_MinimumMovestoEqualArrayElementsII;

import java.util.Arrays;

public class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int value = nums[nums.length / 2];
        int cnt=0;
        for (int val:nums) {
            cnt+=Math.abs(val-value);
        }
        return cnt;
    }
}
