package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;

class StacksDemo {
// wszystkie wiersze w klasie byly zle zformatowane
// alt + -> powoduje przejscie do innego otwartego pliku
	
// klasy fabryk lamia zasade izolacji, poniewaz od implementacji 
// StackArray oraz StackList zalezy jaka abstakcje stosow dostaniemy

    public static void main(String[] args) {
        DefaultStacksFactory factory = new DefaultStacksFactory();
        ArrayStacksFactory afactory = new ArrayStacksFactory();
        ListStacksFactory  lfactory = new ListStacksFactory ();
        testStack(factory);
        testStack(afactory);
        testStack(lfactory);

    }
    
    public static void testStack(IStacksFactory  factory) {
        IStack[] stacks = {factory.GetStandardStack(), factory.GetFalseStack(),
            factory.GetFIFOStack(), factory.GetHanoiStack()};

        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 3; j++) {
                stacks[j].push(i);
            }
        }

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++) {
            stacks[3].push(rn.nextInt(20));
        }

        for (int i = 0; i < stacks.length; i++) {
            while (!stacks[i].isEmpty()) {
                System.out.print(stacks[i].pop() + "  ");
            }
            System.out.println();
        }

        System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
    	
    }

}
