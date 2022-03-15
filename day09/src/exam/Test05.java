package exam;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[4];
		
		int total = 0;
		int avg = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.print("Á¡¼ö ÀÔ·Â : ");
			score[i] = sc.nextInt();
			if(score[i] > 100) {
				i--;
				continue;
			}else {
				total += score[i];
				avg = total / score.length;
			}
		}
		System.out.println("ÃÑÁ¡ : " + total);
		System.out.println("Æò±Õ : " + avg);
		
	}

}
