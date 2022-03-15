package exam;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//수를 입력받아 짝,홀수를 구분하여 출력하시오
			
			System.out.print("하나의 수를 입력하세요 : ");
			int su2 = sc.nextInt();
			
			if(su2 % 2 == 0) {
				System.out.println(su2 + "는 짝수입니다.");
			}else if(su2 % 2 != 0){
				System.out.println(su2 + "는 홀수입니다.");
			}
		
		
	}

}
