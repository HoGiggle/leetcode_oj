package com.company;
import java.util.Stack;

/**
 * Created by MrHu on 2015/8/10.
 */
public class BasicCalculator {
    public int calculate(String s) {
       /* Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        int number = 0;
        int sign = 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                number = 10 * number + (int)(c - '0');
            }else if(c == '+'){
                result += sign * number;
                number = 0;
                sign = 1;
            }else if(c == '-'){
                result += sign * number;
                number = 0;
                sign = -1;
            }else if(c == '('){
                //we push the result first, then sign;
                stack.push(result);
                stack.push(sign);
                //reset the sign and result for the value in the parenthesis
                sign = 1;
                result = 0;
            }else if(c == ')'){
                result += sign * number;
                number = 0;
                result *= stack.pop();    //stack.pop() is the sign before the parenthesis
                result += stack.pop();   //stack.pop() now is the result calculated before the parenthesis

            }
        }
        if(number != 0) result += sign * number;
        return result;*/

        if (s == null || s.length() == 0) return 0;
        Stack<Character> stack = new Stack<Character>();
        Stack<Integer> numStack = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' ') continue;
            if (Character.isDigit(s.charAt(i))){
                int tmp = s.charAt(i) - '0';
                while ((i+1) < s.length() && Character.isDigit(s.charAt(i+1))){
                    tmp = tmp*10 + (s.charAt(++i) - '0');
                }
                numStack.push(tmp);
                while (!stack.isEmpty() && stack.peek() != '('){
                    if (stack.pop() == '+'){
                        numStack.push(numStack.pop() + numStack.pop());
                    }else {
                        numStack.push((numStack.pop() - numStack.pop()) * -1);
                    }
                }
            }else if (s.charAt(i) == ')'){
                stack.pop();
                while (!stack.isEmpty() && stack.peek() != '('){
                    if (stack.pop() == '+'){
                        numStack.push(numStack.pop() + numStack.pop());
                    }else {
                        numStack.push((numStack.pop() - numStack.pop()) * -1);
                    }
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
        System.out.println(numStack.size());
        return numStack.pop();
    }

    public static void main(String[] args) {
        BasicCalculator b = new BasicCalculator();
        String s = "738278";
        System.out.println(b.calculate(s));
    }
}
