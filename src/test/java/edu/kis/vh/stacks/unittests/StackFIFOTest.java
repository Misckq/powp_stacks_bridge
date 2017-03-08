package edu.kis.vh.stacks.unittests;

import org.junit.Test;
import edu.kis.vh.stacks.StackFIFO;
import junit.framework.Assert;

public class StackFIFOTest {
	@Test
 	public void testPop() {
 		StackFIFO stack = new StackFIFO();
 		int firstValue = 1;
 		for(int i=firstValue; i<10; i++){
 			stack.push(i);
 		}
 		int res = stack.pop();
 		Assert.assertEquals(firstValue, res);
	}

}
