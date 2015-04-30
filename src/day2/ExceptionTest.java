package day2;

public class ExceptionTest {

	public static void main(String[] args) {

		int a = 0;
		double b;
		try {
			b = 100 / a; // 0으로 나눔 예외 발생

		} catch (ArithmeticException e) {
			// 예외처리 가능
			System.out.println("예기치 못한 오류로 프로그램이 그만.......ㄹ");
			return;
		} finally {
			System.out.println("자원정리");
		}

	}

}
