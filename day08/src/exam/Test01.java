package exam;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 과목 점수를 입력받아 총점, 평균, 학점을 출력하세요
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		int total = kor + eng + mat;
		int avg = total / 3;
		char grade = ' ';
		
		while(true) {
			if(avg >= 90 || avg <= 100) {
				grade = 'A';
				break;
			}else if(avg >= 80) {
				grade = 'B';
				break;
			}else if(avg >= 70) {
				grade = 'C';
				break;
			}else if(avg >= 60) {
				grade = 'D';
				break;
			}else{
				grade = 'F';
				break;
			}
			
		}
		
		System.out.print("총점 : " + total + "점, 평균 : " + avg + "점, 학점 : " + grade);

	}

}
