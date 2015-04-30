package day2;

import java.io.IOException;

public class ExceptionTest2 {

	public static void main(String[] args) {

		ThrowsText tt = new ThrowsText();

		//tt.suspiciousMethod2(); // unchecked의 예외처리는 선택적

		try {
			tt.suspiciousMethod3();
		} /*
		 * catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); System.out.println("예외가 발생했습니다."); }
		 */// checked의 예외처리는 필수적
		catch (DivideByZeroException e) {
			e.printStackTrace();
		}

	}

}
