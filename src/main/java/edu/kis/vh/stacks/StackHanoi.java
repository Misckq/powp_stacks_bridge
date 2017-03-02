package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

    int totalRejected = ZEROVALUE;
    private static final int ZEROVALUE = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void push(int in) {
        if (!isEmpty() && in > top()) {
            totalRejected++;
        } else {
            super.push(in);
        }
    }
}
