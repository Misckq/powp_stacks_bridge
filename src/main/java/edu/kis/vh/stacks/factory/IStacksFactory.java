package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public interface IStacksFactory {

    public IStack GetStandardStack();

    public IStack GetFalseStack();

    public StackFIFO GetFIFOStack();

    public StackHanoi GetHanoiStack();

}
