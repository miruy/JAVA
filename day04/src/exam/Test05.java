package exam;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//두수를 입력받아 합이 짝수이고 3의 배수이면 출력하시오
		
		System.out.print("첫번째 수를 입력하세요 : ");
		int su1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요 : ");
		int su2 = sc.nextInt();
		
		int hap = su1 + su2;
		
		if(hap % 2 ==0) {
			if(hap % 3 == 0) {
				System.out.println("두 수의 합은 3의 배수입니다.");
			}else {
				System.out.println("두 수의 합은 3의 배수가 아닙니다.");
			}
		}


	}

}
