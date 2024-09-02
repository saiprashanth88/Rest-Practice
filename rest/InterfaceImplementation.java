package b6.rest;

public class InterfaceImplementation implements MyInterface {

	@Override
	public int lambdaExample(int value) {
		
		MyInterface square = (int x) -> x*x;
		return square.lambdaExample(value);
	}

}
