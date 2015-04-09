package com.company;


/**
 * Created by jjhu on 2015/1/27.
 */
public class MinStack {
    private int []elements = new int[100];
    private int top = -1;
    private int minSite = -1;
    private int min = Integer.MAX_VALUE;

    public void push(int x) {
        if (x < min){
            elements[++top] = minSite;
            min = x;
            minSite = top + 1;
        }
        this.elements[++top] = x;
    }

    public void pop() {
        if (top == minSite){
            top--;
            minSite = elements[top--];
            min = elements[minSite];
        }
        top--;
    }

    public int top() {
        return elements[top];
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.getMin());
        stack.pop();
        stack.push(-1);
        System.out.println(stack.getMin());
    }
}
