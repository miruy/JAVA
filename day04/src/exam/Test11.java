package exam;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// 세 과목의 성적을 입력받아 합계와 평균을 구하고 평균이 90점 이상이면 "A"
		// 80점 이상이면 "b", 70점 이상이면 "C",
		// 60점 이상이면 "D", 60점 미만이면 "F"를 출력하시오

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 성적 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 성적 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 성적 : ");
		int mat = sc.nextInt();
		
		int total = kor + eng + mat;
		int average = total / 3;
		
		if(average >= 90) {
			System.out.println("A학점" );
		}else if(average >= 80) {
			System.out.println("B학점" );
		}else if(average >= 70) {
			System.out.println("C학점" );
		}else if(average >= 60) {
			System.out.println("D학점" );
		}else {
			System.out.println("F학점");
		}


	}

}
