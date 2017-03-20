package Question_260_SingleNumberIII;

import java.util.Arrays;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] a = new int[2];
        Arrays.sort(nums);
        int i=0;
        int pos=0;
        while (i<nums.length-1){
            if(nums[i]!=nums[i+1]){
                a[pos++]=nums[i];
                i++;
            }
            else{
                i+=2;
            }
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            a[1]=nums[nums.length-1];
        }
        return a;
    }
}
