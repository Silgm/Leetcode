package Question_13_RomantoInteger;


public class Solution {
    private int getnumber(char c) {
        int num = 0;
        switch (c) {
            case 'I':
                num += 1;
                break;
            case 'V':
                num += 5;
                break;
            case 'X':
                num += 10;
                break;
            case 'L':
                num += 50;
                break;
            case 'C':
                num += 100;
                break;
            case 'D':
                num += 500;
                break;
            case 'M':
                num += 1000;
        }
        return num;
    }

    public int romanToInt(String s) {
        int num = 0;
        int i = 0;
        char[] ch = s.toCharArray();
        while (i < ch.length) {
            if (i + 1 < ch.length && getnumber(ch[i]) < getnumber(ch[i + 1])) {
                num+=(getnumber(ch[i+1])-getnumber(ch[i]));
                i+=2;
            }
            else{
                num+=getnumber(ch[i++]);
            }
        }
        return num;
    }
}
