package exam;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 달팽이 배열
		// 5*5 배열 , 반복문 사용
		int[][] snail = new int[5][5];
		int start = 1;
		int right = 1;
		int left;
		int up;
		int down;

		while(start == 25) {
			for (int i = 0; i < snail.length; i++) {
				for (int j = 0; j < snail[i].length; j++) {
					snail[i][j] = start;
					j++; start++;
					System.out.println(snail[i][j]);
				}
				
			}
			
		}


		
	}
}
