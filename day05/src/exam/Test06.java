package exam;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// 성적표 만들기 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("100점 ~ 95점 : 1 , 90점 ~ 94점 : 2");
		System.out.println("89점 ~ 85점 : 3 , 80점 ~ 84점 : 4");
		System.out.println("79점 ~ 75점 : 5 , 70점 ~ 74점 : 6");
		System.out.println("69점 ~ 65점 : 7 , 60점 ~ 64점 : 8");
		System.out.println("60점 ~ : 9");
		System.out.println();
		System.out.println("자신의 점수가 속하는 번호를 입력하세요 : ");
		
		int score = sc.nextInt();
		
		switch(score){
		case 1 : 
			System.out.println("학점은 A+ 입니다.");
			break;
		case 2 : 
			System.out.println("학점은 A 입니다.");
			break;
		case 3 : 
			System.out.println("학점은 B+ 입니다.");
			break;
		case 4 : 
			System.out.println("학점은 B 입니다.");
			break;
		case 5 : 
			System.out.println("학점은 C+ 입니다.");
			break;
		case 6 : 
			System.out.println("학점은 C+ 입니다.");
			break;
		case 7 : 
			System.out.println("학점은 D+ 입니다.");
			break;
		case 8 : 
			System.out.println("학점은 D 입니다.");
			break;
		case 9 : 
			System.out.println("학점은 F 입니다.");
			break;
		}
		
		
	}

}
