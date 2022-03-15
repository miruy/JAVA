package exam;

import java.util.Scanner;

public class Test01 {
	
	public static void comparison(int a, int b) {
		if(a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		// 두 수를 입력받아 큰 수 출력 메서드 만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		comparison(a, b);

	}

}
