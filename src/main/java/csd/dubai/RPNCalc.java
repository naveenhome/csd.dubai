package csd.dubai;

public class RPNCalc {

	public int Calculate(String expr) {
		// TODO Auto-generated method stub
		String[] inputVal = expr.split(",");
		return Integer.parseInt(inputVal[0])+Integer.parseInt(inputVal[1]);
	}

}
