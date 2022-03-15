package exam;

import java.util.Scanner;

public class Test02 {

	public static int method1(int n) {

		if (n == 1) { // method1(n-1)에서 n이 0이 되면 곱셈결과가 0이 되므로 n이 1일때 리턴
			return 1;
		} else {
			return n * method1(n - 1); // ex n = 3 > 3*2*1
			// * method(n-1) : 메소드를 부르면서 n이던 인자값이 n-1로 초기화
		}
	}

	
	public static String method2(int n) { 
		String reverse = " ";     		 //정수를 문자열로 바꿔서 저장할 변수 

		if (n % 10 == n) {      		 //n이 한자리 수인 경우 
			return Integer.toString(n);  //정수를 문자로 바꾸는 메소드를 사용하여 n을 그대로 출력 
		} else if (n / 10 >= 1) {		 //n이 한자리 수 이상인 경우 
			Integer.toString(n);		 //정수를 문자열로 바꾼 후 
			reverse = (n % 10) + method2(n / 10);  
			//n % 10 : 일의 자리, n / 10 : 십의 자리 
			//method2(n / 10) : 메소드를 부르면서  n / 10(=n의 십의 자리)이 다시 인자로 들어가 n을 초기화
			//값이 만족할때까지 계속 실행하다가 n이 한자리수가 되면 종료 
		}                 
		return reverse;
	}

	public static void main(String[] args) {
		// 재귀 메서드 만들기 실습
		// 인자로 N을 전달하면 N에 대한 팩토리얼을 반환하는 함수
		// 팩토리얼 : 정수 n, 1 ~ n 까지의 곱
		System.out.println(method1(8));

		// 인자로 N을 전달하여 거꾸로 반환하는 메소드
		System.out.println(method2(7514641));

	}

}
