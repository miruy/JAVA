package exam;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		/*
		 사용자로부터 2개의 숫자를 입력받아 두 수의 합을 알려주는 기능
		 */
		//야 사용자한테 정수 두개 입력 받어
		Scanner keyboard = new Scanner(System.in);
		System.out.print("정수 하나 입력해주세요:");
		int n1 = keyboard.nextInt();
		System.out.print("정수 하나 입력해주세요:");
		int n2 = keyboard.nextInt();
		
		//그리고 그거 두개 더해
		int result = n1 + n2;
		
		//결과 알려드려
		System.out.println(n1 + "+" + n2 + "=" + result);
	}
}
