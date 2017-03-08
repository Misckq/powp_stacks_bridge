package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;
import edu.kis.vh.stacks.StackHanoi;

public class StackHanoiTest {
	
	
	
	@Test
    public void testPush() {
		StackHanoi stackObj = new StackHanoi();
        int testValue = 4;
        stackObj.push(testValue);
        int result = stackObj.top();
        Assert.assertEquals(testValue, result);
    }
	
	@Test
 	public void testReportRejected(){
 		StackHanoi stack = new StackHanoi();
 		for(int i = 0 ; i < 4; i++){
 			stack.push(i);
 		}
 		Assert.assertEquals(3, stack.reportRejected());
 	}


}


