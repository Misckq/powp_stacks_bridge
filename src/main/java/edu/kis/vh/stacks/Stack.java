package edu.kis.vh.stacks;
import edu.kis.vh.stacks.list_array.StackArray;
import edu.kis.vh.stacks.list_array.StackList;

public class Stack implements IStack {
	private IStack stack;
	//nie doszlo do istotnych zmian
	
	//F3 otwiera metode w interfejsie
	//CTR+T wyswietla interfejsy oraz klasy implementujace metody
	//CTR+kursor umozliwia otwarcie miejsca deklaracji lub implementacji metody
	
	public Stack() {
		this.stack = new StackList();
	}
	
	
	public Stack(StackList StackList) {
		super();
		stack = StackList;
	}
	
	public Stack(StackArray StackArray) {
		super();
		stack = StackArray;
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
