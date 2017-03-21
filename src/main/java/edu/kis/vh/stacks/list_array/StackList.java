package edu.kis.vh.stacks.list_array;

import edu.kis.vh.stacks.IStack;

public class StackList implements IStack {
//zmieniono pole i
    private Node last;
    private int i;
    private int total = EMPTY_STACK_VALUE;

    public void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return true;
    }

    public int top() {
        if (isEmpty()) {
            return EMPTY_STACK_VALUE;
        }
        return last.getValue();
    }

    public int pop() {
        if (isEmpty()) {
            return EMPTY_STACK_VALUE;
        }
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

	public int getI() {
		return i;
	}
	
    public int getTotal() {
		return total;
	}
	
}

class Node {
	//zmieniono pole value, prev, next na private oraz dodano metody
    protected final int value;
    protected Node prev;
    protected Node next;

    public Node(int i) {
        value = i;
    }

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}

