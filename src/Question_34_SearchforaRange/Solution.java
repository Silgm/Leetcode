package Question_34_SearchforaRange;


public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a = new int[2];
        a[0] = searchSmallRange(nums, target, 0, nums.length - 1);
        a[1] = searchBigRange(nums, target, a[0] + 1, nums.length - 1);
        if (a[1] == -1) {
            a[1] = a[0];
        }
        return a;
    }

    private int searchSmallRange(int[] nums, int target, int start, int end) {
        int value = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                int x = searchSmallRange(nums, target, start, mid - 1);
                if (x < mid && x != -1) {
                    value = x;
                } else {
                    value = mid;
                }
                break;
            } else if (nums[mid] > target) {
                if (start != end) {
                    end = mid;
                } else {
                    end--;
                }
            } else {
                if (end - start <= 1) {
                    start++;
                } else {
                    start = mid;
                }
            }
        }
        return value;
    }

    private int searchBigRange(int[] nums, int target, int start, int end) {
        int value = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                int x = searchBigRange(nums, target, mid + 1, end);
                if (x > mid) {
                    value = x;
                } else {
                    value = mid;
                }
                break;
            } else if (nums[mid] > target) {
                if (start != end) {
                    end = mid;
                } else {
                    end--;
                }
            } else {
                if (end - start <= 1) {
                    start++;
                } else {
                    start = mid;
                }
            }
        }
        return value;
    }

}
