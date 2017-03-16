package edu.kis.vh.stacks;

public class Stack {
	private StackArray StackArray;
	
	public Stack() {
		this.StackArray = new StackArray();
	}
	
	
	public Stack(edu.kis.vh.stacks.StackArray stackArray) {
		super();
		StackArray = stackArray;
	}
	

	public void push(int i) {
		StackArray.push(i);
	}

	public boolean isEmpty() {
		return StackArray.isEmpty();
	}

	public boolean isFull() {
		return StackArray.isFull();
	}

	public int top() {
		return StackArray.top();
	}

	public int getTotal() {
		return StackArray.getTotal();
	}

	public int pop() {
		return StackArray.pop();
	}


  
}
