package Question_476_NumberComplement;

public class Solution {
    public int findComplement(int num) {
        char[] c=Integer.toBinaryString(num).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char x:c) {
            if(x=='1'){
                sb.append("0");
            }
            else {
                sb.append("1");
            }
        }
        return Integer.valueOf(sb.toString(),2);
    }
}
