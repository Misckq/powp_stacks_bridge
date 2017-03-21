package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list_array.StackList;

public class StackHanoi extends Stack {

    public StackHanoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackHanoi(StackList StackList) {
		super(StackList);
		// TODO Auto-generated constructor stub
	}

	private int totalRejected = ZEROVALUE;
    private static final int ZEROVALUE = 0;

    public int reportRejected() {
        return totalRejected;
    }
    
    @Override
    public void push(int in) {
        if (!isEmpty() && in > top()) {
            totalRejected++;
        } else {
            super.push(in);
        }
    }
    
}
