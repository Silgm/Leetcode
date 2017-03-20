package Question_20_ValidParentheses;

import java.util.LinkedList;

public class Solution {
    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        LinkedList<Character> stack = new LinkedList<>();
        for (char x : c) {
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
            } else {
                if (!stack.isEmpty()) {
                    int left = 0;
                    switch (stack.getFirst()) {
                        case '(':
                            left = 1;
                            break;
                        case '[':
                            left = 2;
                            break;
                        case '{':
                            left = 3;
                    }
                    int right = 0;
                    switch (x) {
                        case ')':
                            right = 1;
                            break;
                        case ']':
                            right = 2;
                            break;
                        case '}':
                            right = 3;
                            break;
                    }
                    if (left != right) {
                        return false;
                    }
                    else {
                        stack.pop();
                    }
                } else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}
