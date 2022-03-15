package exam;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 키가 110cm이상 일시 라바 트위스터를 탑승가능하다.
		// 키가 110cm이하 일때 보호자가 옆에 있는지 체크한다.
		// 보호자 옆에 있을 시 탑승 가능, 없을 시 탑승 불가능
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("키를 입력하세요 : ");
		int height = sc.nextInt();
		
		if(height >= 110) {
			System.out.println("탑승 가능");
		}else {
			System.out.println("보호자가 옆에 있나요?");
			System.out.println("있다 : 1, 없다 : 2");
			int answer = sc.nextInt();
					if(answer == 1) {
						System.out.println("탑승가능");
					}else {
						System.out.println("탑승 불가능");
			}
		}
		

	}

}
