package exam;

import java.util.Scanner;

public class Test07 {
	
	public static int absoluteVlue(int a) {
		int abv = 0;
		if(a < 0) {
			abv = a * -1;   //ex) -3 X -1 = 3  음수 곱하기 음수는 양수이고 숫자는 변하면 안됨으로 -1를 곱해줌 
		}else {
			abv = a;
		}
		return abv;
	}

	public static void main(String[] args) {
		/*
		 * 인자로 n을 전달하면 n에 대한 절대 값을 반환하는 함수, 인자(argument): 메서드 호출 시 전달된 데이터
		 * 잘대값 : 기준(정해진 수)으로 부터 떨어진 거리를 나타내며 ex) |3| = 3, |-3| = 3
		 */
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(absoluteVlue(a));

	}
}
