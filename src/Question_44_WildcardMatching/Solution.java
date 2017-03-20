package Question_44_WildcardMatching;

public class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (p.charAt(i) == '*') count++;
        }
        if (count == 0 && m != n) return false;
        else if (n - count > m) return false;
        boolean[] match = new boolean[m + 1];
        match[0] = true;
        for (int i = 0; i < m; i++) {
            match[i + 1] = false;
        }
        for (int i = 0; i < n; i++) {
            if (p.charAt(i) == '*') {
                for (int j = 0; j < m; j++) {
                    match[j + 1] = match[j] || match[j + 1];
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    match[j + 1] = (p.charAt(i) == '?' || p.charAt(i) == s.charAt(j)) && match[j];
                }
                match[0] = false;
            }
        }
        return match[m];
    }

}
