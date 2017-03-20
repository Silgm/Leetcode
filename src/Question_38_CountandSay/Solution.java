package Question_38_CountandSay;

public class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        return nextString(countAndSay(n-1));
    }

    private String nextString(String str) {
        char[] c = str.toCharArray();
        int pos = 0;
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        while (pos < c.length) {
            if (pos + 1 < c.length && c[pos] == c[pos + 1]) {
                pos++;
                cnt++;
                continue;
            }
            if (pos + 1 == c.length || c[pos] != c[pos + 1]) {
                sb.append(cnt + "" + c[pos]);
                cnt = 1;
                pos++;
            }
        }
        return sb.toString();
    }
}
