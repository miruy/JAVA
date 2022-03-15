package exam;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
	// 점수와 학년을 입력받아 60점 이상이면 통과, 미만이면 낙제이다.(1~4학년)
	// 단, 4학년은 70점 이상이 통과이며 65점 이상은 경고, 65점이하는 낙제로 구분한다.
		Scanner sc = new Scanner(System.in); 
		
		int score = 0;
		int grade = 0;
		String green = "통과";
		String yellow = "경고";
		String red = "낙제";
				
		System.out.print("학년을 입력하세요 : ");
		grade = sc.nextInt();
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		if(grade < 4) {
			if(score >= 60) {
				System.out.println(green);
			}else {
				System.out.println(red);
			}
		}else if(score >= 70) {
			System.out.println(green);
		}else if(score >= 65) {
			System.out.println(yellow);
		}else {
			System.out.println(red);
		}
		

	}

}
