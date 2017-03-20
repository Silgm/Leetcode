package Question_14_LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs.length == 0) {
            return "";
        }
        int position = 0;
        int longest_length = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() == 0) {
                return "";
            }
            if (strs[i].length() > longest_length) {
                longest_length = strs[i].length();
                position = i;
            }
        }
        boolean t = true;
        int n = 0;
        while (n <= strs[position].length() && t) {
            int i = 0;
            while (i < strs.length && t) {
                if ((strs[i].length() > n) && (strs[i].charAt(n) == strs[position].charAt(n))) {
                    i++;
                } else {
                    t = false;
                    n--;
                }
            }
            n++;
        }
        return strs[position].substring(0, n);
    }
}
