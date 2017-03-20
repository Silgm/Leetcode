package Question_33_SearchinRotatedSortedArray;

public class Solution {
    public int search(int[] nums, int target) {
        int position=0;
        for (int value:nums) {
            if(value==target){
                return position;
            }
            position++;
        }
        return -1;
    }
}
