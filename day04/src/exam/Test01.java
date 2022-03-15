package exam;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//입력한 데이터가 3의 배수인 경우 출력하시오
			
			System.out.print("하나의 수를 입력하세요 : ");
			int su1 = sc.nextInt();
			
			if(su1 % 3 == 0) {
				System.out.println(su1 + "는 3의 배수입니다.");
			}else {
				System.out.println(su1 + "는 3의 배수가 아닙니다.");
			}
		
		
	}

}
