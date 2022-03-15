package exam;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// 2단 부터 9단 까지 구구단 출력하기
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
		

	}

}
