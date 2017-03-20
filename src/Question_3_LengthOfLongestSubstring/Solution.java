package Question_3_LengthOfLongestSubstring;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0||s.length()==1) {
            return s.length();
        }
        int n = 2;
        String str = "";
        while (true) {
            int i;
            for (i = 0; i < s.length() + 1 - n; i += 1) {
                str = s.substring(i, i + n);
                char[] c = str.toCharArray();
                int j = 0;
                int k = 1;
                for (; j < c.length - 1; j++) {
                    for (k=j+1; k < c.length && c[j] != c[k]; k++) {
                    }
                    if (k != c.length) {
                        break;
                    }
                }
                if (j == c.length - 1 && k == c.length) {
                    n++;
                    break;
                }
            }
            if( i == s.length() + 1 - n){
                return n-1;
            }
        }
    }
}
