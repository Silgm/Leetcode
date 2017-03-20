package Question_31_NextPermutation;

public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length > 1) {
            int i = nums.length - 2;
            int j = nums.length - 1;
            while (i >= 0 && nums[i] >= nums[j]) {
                i--;
                j--;
            }
            if (i != -1) {
                int k;
                for (k = nums.length - 1; k > i && nums[k] <= nums[i]; k--) ;
                swap(nums, k, i);
            }
            i++;
            j = nums.length - 1;
            while (i < j) {
                swap(nums, i, j);
                i++;
                j--;
            }
        }
    }

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

}
