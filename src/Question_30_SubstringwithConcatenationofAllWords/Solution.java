package Question_30_SubstringwithConcatenationofAllWords;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> mylist = new LinkedList<>();
        if (words[0].length() < 1 || words.length > 0) {
            return mylist;
        }
        StringBuilder sb = new StringBuilder(s);
        int[] array = new int[words.length];
        int len = 0;
        while (sb.toString().length() >= words[0].length() * words.length) {
            int position = 0;
            while (position < array.length) {
                int value = sb.indexOf(words[position]);
                if (value == -1) {
                    return mylist;
                }
                array[position++] = value;
            }
            Arrays.sort(array);
            if (isCommonValueArray(array, words[0].length())) {
                mylist.add(len + array[0]);

            } else {

            }
        }
        return mylist;
    }

    public boolean isCommonValueArray(int[] a, int n) {
        if (a.length < 1) {
            return true;
        }
        int value = a[1] - a[0];
        if (value != n) {
            return false;
        }
        int i = 1;
        while (i + 1 < a.length) {
            if (a[i + 1] - a[i] != value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
