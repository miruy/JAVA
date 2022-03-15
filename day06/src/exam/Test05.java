package exam;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// 두 수를 입력받아 두 수 사이의 합을 구하시오 (예 : 0 ~ 11 = 55)
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("첫번째 수를 입력 : ");
		int su1 = sc.nextInt();
		System.out.print("두번째 수를 입력 : ");
		int su2 = sc.nextInt();
		
		for(int i = su1; i < su2; i++) {
			sum += i;
		}
		System.out.println(su1 + " ~ " + su2 + " = " + sum);
		

	}

}
