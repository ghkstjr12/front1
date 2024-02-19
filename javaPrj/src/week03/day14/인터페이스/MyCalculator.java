package week03.day14.인터페이스;

public class MyCalculator implements CalculatorI{

	@Override
	public int add(int num1, int num2) {
		int add= num1+ num2;
		return 0;
	}

	@Override
	public int sub(int num1, int num2) {
		int add= num1 - num2;
		return 0;
	}

}
