package edu.kis.vh.stacks.list_array;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {
	
    private static final int SIZE = 12;
    private static final int FULL_STACK = 11;
    
    private final int[] ITEMS = new int[SIZE];
    private int total = EMPTY_STACK_VALUE;
    
    
    public void push(int i) {
        if (!isFull()) {
            ITEMS[++total] = i;
        }
    }

    public boolean isEmpty() {
        return total == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == FULL_STACK;
    }

    public int top() {
        if (isEmpty()) {
            return EMPTY_STACK_VALUE;
        }
        return ITEMS[total];
    }

    public int getTotal() {
		return total;
	}

	public int pop() {
        if (isEmpty()) {
            return EMPTY_STACK_VALUE;
        }
        return ITEMS[total--];
    }

}
