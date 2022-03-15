package exam;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 숙박 업소 관리프로그램
		// 층의 개수와 방의 개수를 입력받아 String형으로 2차원 배열을 생성
		Scanner sc = new Scanner(System.in);

		int select;
		int floor = 0;
		int room = 0;
		String name = " ";

		System.out.print("모든 층 : ");
		int allFloor = sc.nextInt();
		System.out.print("모든 방 : ");
		int allRoom = sc.nextInt();
		boolean oc = true;
		String[][] info = new String[allFloor][allRoom];
		
		while(oc) {
			System.out.print("1.입실   2.퇴실   3.전체보기   4.종료  :  ");
			select = sc.nextInt();
			if (select == 1) {
				System.out.print("몇층에 입실 : ");
				floor = sc.nextInt();
				System.out.print("몇번방에 입실 : ");
				room = sc.nextInt();
				System.out.print("투숙객 이름 : ");
				name = sc.next();
				info[floor][room] = name;
			} else if (select == 2) {
				System.out.print("퇴실 층 : ");
				floor = sc.nextInt();
				System.out.print("퇴실 방 : ");
				room = sc.nextInt();
				System.out.println(floor + "층" + room + "방이 퇴실 처리 되었습니다.");
				info[floor][room] = null;
			} else if (select == 3) {
				for (int i = 0; i < info.length; i++) {
					System.out.println(i +1+ "층");
					for (int j = 0; j < info[i].length; j++) {
						System.out.print(j+ "번방 투숙객 : " + info[i][j]+"\n");
					}
					continue;
				}
			} else {
				System.out.println("숙박업소 관리 프로그램을 종료합니다.");
				oc = false;
			}

		}

	}
}
