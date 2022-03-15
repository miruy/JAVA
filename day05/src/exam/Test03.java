package exam;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 다음 코드는 세 과목 점수를 입력 받아 총점과 평균을 구하고
		// 평균이
		// 90이상이면 A,
		// 80이상이면 B,
		// 70이상이면 C,
		// 60이상이면 D,
		// 그 외에는 F를 출력하는 프로그램이다.
		// 실행 결과에 문제가 있는데 원인을 찾아 해당 부분을 수정하시오.

		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수를 입력하세요 : ");
		float kor = sc.nextFloat();

		System.out.print("영어점수를 입력하세요 : ");
		float eng = sc.nextFloat();

		System.out.print("수학점수를 입력하세요 : ");
		float mat = sc.nextFloat();

		float total = kor + eng + mat;
		float avg = total / 3.0f;
		char grade = 0;

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("총점:" + String.format("%.2f", total) + "점");
		System.out.println("평균:" + String.format("%.2f", avg) + "점");
		// format 메서드는 문자열의 형식을 설정하는 메서드(소수점 0.2 부분까지만 출력)
		System.out.println("등급:" + grade);

	}

}
