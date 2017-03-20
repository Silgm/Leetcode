package Question_7_ReverseInteger;

public class Solution {
    public int reverse(int x) {
        boolean v = false;
        if (x < 0) {
            x *= -1;
            v = true;
        }
        long value = 0;
        while (x > 0) {
            value = value * 10 + (x % 10);
            x = x / 10;
        }
        if(value>2147483647){
            return 0;
        }
        else if (v) {
            value *= -1;
        }
        return (int)value;
    }
}
