package exam;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// 사용자로 부터 10개의 정수를 입력받아 평균을 구하세요
		
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		int sum = 0;
		int avg;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "번째 수 입력 : ");
			su = sc.nextInt();
			sum += su;
		}
		
		avg = sum / 10;
		
		System.out.println(sum);
		System.out.println(avg);
		

	}

}
