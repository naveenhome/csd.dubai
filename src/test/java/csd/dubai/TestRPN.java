package csd.dubai;

import junit.framework.TestCase;

public class TestRPN extends TestCase{
	

	public void testCase1()
	{
		String expr = "2,2,+";
		RPNCalc obj = new RPNCalc();
		assertEquals(4, obj.Calculate(expr));
	}
	public void testCase3()
	{
		String expr = "2,3,+";
		RPNCalc obj = new RPNCalc();
		assertEquals(5, obj.Calculate(expr));
	}
	public void testCase2()
	{
		String expr = "2,3,+,2,+";
		RPNCalc obj = new RPNCalc();
		assertEquals(7, obj.Calculate(expr));
	}


}
