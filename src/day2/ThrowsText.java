package day2;

import java.io.IOException;

public class ThrowsText {

	public void suspiciousMethod() throws IOException {
		throw new IOException();// checked exception : 함수에 예외발생을 명시해주어야함
	}

	public void suspiciousMethod2() {
		throw new ArithmeticException();// unchecked exception 굳이 명시안해줘도됨.
	}

	public void suspiciousMethod3() throws DivideByZeroException {
		throw new DivideByZeroException("영으로 나누지 마세요");// unchecked exception 굳이
														// 명시안해줘도됨.
	}

}
