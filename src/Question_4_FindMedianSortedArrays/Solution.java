package Question_4_FindMedianSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double value =0;
        int[] array = new int[nums1.length + nums2.length];
        int i=0;
        int j=0;
        for (int key = 0; key < array.length; key++) {
            if(j==nums2.length||(i<nums1.length&&nums1[i]<nums2[j])){
                array[key]=nums1[i++];
            }
            else{
                array[key]=nums2[j++];
            }
        }
        if(array.length%2!=0){
            value=array[array.length/2];
        }
        else{
            value=((double)(array[array.length/2]+array[array.length/2-1]))/2;
        }
        return value;
    }
}
