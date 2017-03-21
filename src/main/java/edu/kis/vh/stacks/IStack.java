package edu.kis.vh.stacks;

public interface IStack {
	//realizacja zadania 10 pomogla poniewaz wystarczylo 
	//zmienic wartosc jednej stalej w interfejsie
	
    static final int EMPTY_STACK_VALUE = 0;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int getTotal();

	int pop();

}