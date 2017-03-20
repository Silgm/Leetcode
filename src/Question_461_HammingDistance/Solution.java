package Question_461_HammingDistance;

public class Solution {
    public int hammingDistance(int x, int y) {
        String strx = Integer.toBinaryString(x);
        String stry = Integer.toBinaryString(y);
        char[] cx = strx.toCharArray();
        char[] cy = stry.toCharArray();
        int cnt =0;
        for (int i = cx.length - 1, j = cy.length - 1; i > -1 || j > -1; i--, j--) {
            if(((i>-1&&j>-1)&&(cx[i]!=cy[j]))||((i<0&&j>-1)&&(cy[j]=='1'))||((j<0&&i>-1))&&(cx[i]=='1')){
                cnt++;
            }
        }
        return cnt;
    }
}
