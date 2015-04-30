package day2;

public class DivideByZeroException extends Exception {

	public DivideByZeroException() {
		super("0으로 나누기");
	}

	public DivideByZeroException(String string) {
		System.out.println(string);
	}

}
