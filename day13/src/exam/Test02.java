package exam;

import java.util.Scanner;

public class Test02 {
	
	public static int inadd(int a, int b) {
	int sum = 0;
		for(int i = a; i <= b; i++) {
			a = i;
			sum += a;
		}
		return sum;
	}

	public static void main(String[] args) {
		// 두수를 입력받아 두수 사이의 합을 출력하는 메서드 만들기 
		Scanner sc = new Scanner(System.in);
		System.out.println("두수 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(inadd(a, b));
	}

}
