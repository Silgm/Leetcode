package Question_17_LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> mylist = new ArrayList<>();
        if (digits.length() == 0) {
            return mylist;
        }
        String[] numstring = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String[] strs = new String[digits.length()];
        int[] arrlen = new int[digits.length()];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            strs[i] = numstring[Integer.valueOf(""+digits.charAt(i))];
            arrlen[i] = strs[i].length();
        }
        for (int i = 0; i < arrlen.length; i++) {
            list.add(0);
        }
        while (list.get(0) < arrlen[0]) {
            String s = "";
            for (int i = 0; i < list.size(); i++) {
                s += strs[i].charAt(list.get(i));
            }
            mylist.add(s);
            list.set(list.size() - 1, list.get(list.size() - 1) + 1);
            for (int i = list.size() - 1; i > -1; i--) {
                if (list.get(i) == arrlen[i] && i != 0) {
                    list.set(i, 0);
                    list.set(i - 1, list.get(i - 1) + 1);
                }
            }
        }
        return mylist;
    }
}
