package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list_array.StackList;

/**
 * Klasa reprezentuje stos First In, First Out, dane sa obsługiwane w takiej kolejności, w jakiej zostały dostarczone
 * 
 * @author Autor
 *
 */

public class StackFIFO extends Stack {

    private final IStack temp = new Stack();

    public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(StackList StackList) {
		super(StackList);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
     * @see edu.kis.vh.stacks.Stack#pop()
     * @return obiekt typu int, ktory zostal sciagniety ze stosu
     */
    @Override
    public int pop() {
        while (!isEmpty()) {
            temp.push(super.pop());
        }

        int ret = temp.pop();

        while (!temp.isEmpty()) {
            push(temp.pop());
        }

        return ret;
    }
}
