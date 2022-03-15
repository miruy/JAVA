package exam;

import java.util.Scanner;

public class Test03 {
	
	public static void oddOrEven(int a) {
		if(a % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}

	public static void main(String[] args) {
		// 입력 받은 수가 홀수인지 짝수인지 반환하는 베서드
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력");
		int a = sc.nextInt();
		
		oddOrEven(a);
	}

}
