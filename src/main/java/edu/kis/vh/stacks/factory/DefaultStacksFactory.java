package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.IStacksFactory;

public class DefaultStacksFactory implements IStacksFactory {

    @Override
    public IStack GetStandardStack() {
        return new Stack();
    }

    @Override
    public IStack GetFalseStack() {
        return new Stack();
    }

    @Override
    public StackFIFO GetFIFOStack() {
        return new StackFIFO();
    }

    @Override
    public StackHanoi GetHanoiStack() {
        return new StackHanoi();
    }

}
