package edu.kis.vh.stacks;
import edu.kis.vh.stacks.list.StackList;

public class Stack {
	private StackList stack;
	
	public Stack() {
		this.stack = new StackList();
	}
	
	
	public Stack(StackList StackList) {
		super();
		stack = StackList;
	}
	

	public void push(int i) {
		stack.push(i);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int top() {
		return stack.top();
	}

	public int getTotal() {
		return stack.getTotal();
	}

	public int pop() {
		return stack.pop();
	}


  
}
