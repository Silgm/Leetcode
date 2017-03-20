package Question_35_SearchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        System.out.println(new Solution().searchInsert(a,0));
    }
}
