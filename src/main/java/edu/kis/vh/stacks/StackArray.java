package edu.kis.vh.stacks;

public class StackArray {
	
    private static final int EMPTY_STACK_VALUE = -1;
    private static final int SIZE = 12;
    
    private final int[] ITEMS = new int[SIZE];
    private int total = EMPTY_STACK_VALUE;

    public void push(int i) {
        if (!isFull()) {
            ITEMS[++total] = i;
        }
    }

    public boolean isEmpty() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return ITEMS[total];
    }

    public int getTotal() {
		return total;
	}

	public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return ITEMS[total--];
    }

}
