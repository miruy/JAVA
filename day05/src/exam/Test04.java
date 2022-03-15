package exam;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// 메뉴를 만들어 관리프로그램 만들기 
		/* 1. 학생 등록
		 * 2. 국어, 영어, 수학 점수 입력
		 * 3. 학생 이름 출력
		 * 4. 총점 출력
		 * 5. 평균 출력
		 * 6. 종료 
		 */
		String name = " ";
		int kor = 0;
		int eng = 0;
		int mat = 0;
		int total = kor + eng + mat;
		int avg = total / 3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 관리프로그램에 등록하시겠습니까?");
		System.out.println("이름 등록 : 1 , 점수 등록 : 2 , 학생 이름 출력 : 3");
		System.out.println("총점 출력 : 4 , 평균 출력 : 5 , 종료 : 6");
		System.out.print("입력 : ");
		int answer = sc.nextInt();
		sc.nextLine();
		switch(answer) {
		case 1 : 
			System.out.print("등록할 이름을 입력하세요 : ");
			name = sc.next();
			break;
		case 2 : 
			System.out.print("국어점수를 입력하세요 : ");
			kor = sc.nextInt();
			System.out.print("영어점수를 입력하세요 : ");
			eng = sc.nextInt();
			System.out.print("수학점수를 입력하세요 : ");
			mat = sc.nextInt();
			break;
		case 3 :
			System.out.println("등록된 학생 : " + name);
			break;
		case 4 : 	
			total = kor + eng + mat;
			System.out.println("총점 : " + total);
			break;
		case 5 :	
			avg = total / 3;
			System.out.println("평균 : " + avg);
			break;
		case 6 :	
			System.out.println("종 료");
		default : 
			System.out.println("잘못 입력하셨습니다.");
		}
		
		

	}

}
