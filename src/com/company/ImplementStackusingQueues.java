package com.company;

/**
 * Created by MrHu on 2015/7/27.
 */
public class ImplementStackusingQueues {
    private final int capacity = 100;
    private int []queue1 = new int[capacity];
    private int head1 = 0;
    private int end1 = 0;



    // Push element x onto stack.
    public void push(int x) {
        queue1[end1++] = x;
        for (int i = 0; i < (end1 - head1 + capacity) % capacity - 1; i++){
            queue1[end1++] = queue1[head1++];
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        head1++;
    }

    // Get the top element.
    public int top() {
        return queue1[head1];
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return head1 == end1 ? true : false;
    }
}
