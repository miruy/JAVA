package exam;

import java.util.Scanner;

public class Test05 {

	public static int method(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static float method(float a, float b) {
		float sum = a + b;
		return sum;
	}

	public static float method(int a, float b) {
		float sum = a + b ;
		return sum;
	}

	public static float method(float a, int b) {
		float sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		/*
		 * 두수의 합을 반환하는 메서드 
		 * 1. 정수(int) 두개를 입력받아 더한 값을 반환하는 메서드
		 * 2. 실수(float) 두개를 입력받아 더한값을 반환하는 메서드 
		 * 3. 정수와 실수 두개를 입력받아 더한 값을 반환하는 메서드 
		 * 4. 실수와 정수 두개를 입력받아 더한 값을 반환하는 메서드
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수 입력 ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(method(a, b));
		
		System.out.println("두 수 입력 ");
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		System.out.println(method(c, d));
		
		System.out.println("두 수 입력 ");
		int e = sc.nextInt();
		float f = sc.nextFloat();
		System.out.println(method(e, f));
		
		System.out.println("두 수 입력 ");
		float g = sc.nextFloat();
		int h = sc.nextInt();
		System.out.println(method(g, h));
		
}
}
