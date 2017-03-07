package edu.kis.vh.stacks.list;

public class Node {
//zmieniono pole value, prev, next na private oraz dodano metody
    private final int value;
    private Node prev;
	private Node next;

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
