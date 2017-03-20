package Question_389_FindtheDifference;

public class Solution {
    public char findTheDifference(String s, String t) {
        int charCodeS = 0, charCodeT = 0;
        for (int i = 0; i < s.length(); ++i)
            charCodeS += (int) s.charAt(i);
        for (int i = 0; i < t.length(); ++i)
            charCodeT += (int) t.charAt(i);
        return (char) (charCodeT - charCodeS);
    }
}
