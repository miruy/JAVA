package exam;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// 정수 두개를 입력받아 사칙연산을 하는 계산기 만들기
		/* 연산자 입력 : +
		 * 첫번째 수 입력 : 1
		 * 두번째 수 입력 : 2
		 * 결과 1+2=3
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		int su1 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		String cal = sc.next();
		System.out.print("두번째 수 입력 : ");
		int su2 = sc.nextInt();
		
		
		switch(cal) {
		case "+" :
			System.out.println(su1 + " + " + su2 + " = " + (su1+su2));
			break;
		case "-" :
			System.out.println(su1 + " - " + su2 + " = " + (su1-su2));
			break;
		case "*" :
			System.out.println(su1 + " * " + su2 + " = " + (su1*su2));
			break;
		case "/" :
			System.out.println(su1 + " / " + su2 + " = " + (su1/su2));
			break;
		case "%" :
			System.out.println(su1 + " % " + su2 + " = " + (su1%su2));
			break;	 
		
		}
	}

}
