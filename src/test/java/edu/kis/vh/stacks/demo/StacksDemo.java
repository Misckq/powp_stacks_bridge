package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {
// wszystkie wiersze w klasie byly zle zformatowane
// alt + -> powoduje przejscie do innego otwartego pliku

    public static void main(String[] args) {
        DefaultStacksFactory factory = new DefaultStacksFactory();
        testStack(factory);

    }
    
    public static void testStack(DefaultStacksFactory factory) {
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
