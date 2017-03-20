package Question_485_MaxConsecutiveOnes;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int k = 0;
        while (k<nums.length) {
            int cnt = 0;
            int i = k;
            if(nums[k]==0){
                k++;
                continue;
            }
            for (; i < nums.length && nums[i] == 1; i++, cnt++) ;
            if(cnt>max){
                max=cnt;
            }
            k=i;
        }
        return max;
    }
}
