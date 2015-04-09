package com.company;

import java.util.Stack;

/**
 * Created by jjhu on 2015/1/27.
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return false;
        Stack<Character> stack = new Stack<Character>();
        char []chrArray = s.toCharArray();
        for (int i = 0; i < chrArray.length; i++){
            if (stack.empty())
                stack.push(chrArray[i]);
            else {
                String item = stack.peek() + "" + chrArray[i];
                if (item.equals("()") || item.equals("[]") || item.equals("{}"))
                    stack.pop();
                else
                    stack.push(chrArray[i]);
            }
        }

        if (stack.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s = "([[)";
        System.out.println(isValid(s));
        s = "(}";
        System.out.println(isValid(s));
    }
}
