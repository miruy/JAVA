package exam;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//두 수를 입력받아 큰 수가 짝수이면 출력하시오
		
		System.out.print("첫번째 수를 입력하세요 : ");
		int su1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요 : ");
		int su2 = sc.nextInt();
		
		if(su1 > su2) {
			if(su1 % 2 == 0) {
				System.out.println("두 수 중 크고 짝수인 수 : "+ su1);
			}
		}else if(su2 > su1) {
			if(su2 % 2 == 0) {
				System.out.println("두 수 중 크고 짝수인 수 : "+ su2);
			}
		}
	

	}

}
