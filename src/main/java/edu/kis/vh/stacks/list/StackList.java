package edu.kis.vh.stacks.list;

class StackList {
//zmieniono pole i
    private Node last;
    private int i;
    private static final int EMPTY_STACK_VALUE = -1;

    public void pushElement(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean empty() {
        return last == null;
    }

    public boolean full() {
        return false;
    }

    public int peek() {
        if (empty()) {
            return EMPTY_STACK_VALUE;
        }
        return last.getValue();
    }

    public int pop() {
        if (empty()) {
            return EMPTY_STACK_VALUE;
        }
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

	public int getI() {
		return i;
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

