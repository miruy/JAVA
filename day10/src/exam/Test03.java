package exam;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 주민등록번호 생성하기
		// 검증이 가능한지 확인하기
		// bigArea, midArea, smallArea 는 편의상 2개로 정함
		Scanner sc = new Scanner(System.in);

		String[] idNum = {"000000-0000000"};
		int[] year = new int[4];
		int month;
		int day;
		int gender = 0;
		int bigArea = 0; // 도
		int midArea = 0;
		int smallArea = 0; // 동
		int[] dobong = { 5, 6 };
		int[] bundang = { 6, 7 };
		int[] changdong = { 8, 9 };
		int[] eunheng = { 9, 8 };
		
		for(int i = 0; i < idNum.length; i++) {
		 
		}

		System.out.print("태어난 년도 입력 : ");
		for(int i = 0; i < year.length; i++) {
			year[i] = sc.nextInt();
		}

		System.out.print("태어난 월 입력 : ");
		month = sc.nextInt();

		System.out.print("태어난 일 입력 : ");
		day = sc.nextInt();
		sc.nextLine();

		System.out.print("성별 입력 : ");
		String stringgender = sc.nextLine();
		if (stringgender.equals("남자")) {
			gender = 1;
		} else if (stringgender.equals("여자")) {
			gender = 2;
		}

		System.out.println("택1) 서울특별시, 경기도 성남시");
		System.out.print("출생 시/도 입력 : ");
		String stringBigArea = sc.nextLine();
		if (stringBigArea.equals("서울특별시")) {
			bigArea = 3;
		} else if (stringBigArea.equals("경기도 성남시")) {
			bigArea = 4;
		}
		System.out.println("택1) 도봉구, 분당구");
		System.out.print("출생 구 입력 : ");
		String StringMidArea = sc.nextLine();
		if (StringMidArea.equals("도봉구")) {
			for (int i = 0; i < dobong.length; i++) {
				midArea = dobong[i];
			}
		} else if (StringMidArea.equals("분당구")) {
			for (int i = 0; i < bundang.length; i++) {
				midArea = bundang[i];
			}
		}

		System.out.println("택1) 창동, 은행동");
		System.out.print("출색 동 입력 : ");
		String stringSmallArea = sc.nextLine();
		if (stringSmallArea.equals("창동")) {
			for (int i = 0; i < changdong.length; i++) {
				smallArea = changdong[i];
			}
		} else if (stringSmallArea.equals("은행동")) {
			for (int i = 0; i < eunheng.length; i++) {
				smallArea = eunheng[i];
			}
		}
		sc.nextLine();

		System.out.print("주민등록번호 생성 : ");
		System.out.printf("%d%d%d%d%d%d - %d%d%d%d%d%d%d", year[2],year[3], month, day, gender, bigArea, midArea, smallArea);

	}

}
