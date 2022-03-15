package exam;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// 월을 입력받아 해당 월의 일수를 보여주는 프로그램
		// 1,3,5,7,8,10,12월 : 31일
		// 4,6,9,11월 : 30일
		// 2월 : 28일
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("31일");
			break;
		case 4 : 	
		case 6 : 
		case 9 : 
		case 11 :
			System.out.println("30일");
			break;
		case 2 :
			System.out.println("28일");
			break;
			
		
		}
				
	}

}
