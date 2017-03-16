package edu.kis.vh.stacks;
import edu.kis.vh.stacks.list.StackList;

public class Stack implements IStack {
	private StackList stack;
	
	public Stack() {
		this.stack = new StackList();
	}
	
	
	public Stack(StackList StackList) {
		super();
		stack = StackList;
	}
	

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#push(int)
	 */
	@Override
	public void push(int i) {
		stack.push(i);
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#isFull()
	 */
	@Override
	public boolean isFull() {
		return stack.isFull();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#top()
	 */
	@Override
	public int top() {
		return stack.top();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#getTotal()
	 */
	@Override
	public int getTotal() {
		return stack.getTotal();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#pop()
	 */
	@Override
	public int pop() {
		return stack.pop();
	}


  
}
