package com.company;

/**
 * Created by MrHu on 2015/7/24.
 */

public class ImplementQueueusingStacks {
    private final int capacity = 100;
    private int []inStack = new int[capacity];
    private int []outStack = new int[capacity];
    private int inTop = -1;
    private int outTop = -1;

    // Push element x to the back of queue.
    public void push(int x) {
        inStack[++inTop] = x;
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (outTop == -1){
            while (inTop != -1){
                outStack[++outTop] = inStack[inTop--];
            }
        }
        outTop--;
    }

    // Get the front element.
    public int peek() {
        if (outTop == -1){
            while (inTop != -1){
                outStack[++outTop] = inStack[inTop--];
            }
        }
        return outStack[outTop];
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if (inTop == -1 && outTop == -1){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        ImplementQueueusingStacks i = new ImplementQueueusingStacks();
        i.push(1);
        i.push(2);
        i.peek();
        i.pop();
        i.peek();
        i.pop();
        System.out.println(i.empty());
    }
}
