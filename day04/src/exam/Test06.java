package exam;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//수를 입력받아 출력하시오(단, 3의 배수는 제외하고 3의 배수이면서 5의 배수인 수는 출력)
		
		System.out.print("수를 입력하세요 : ");
		int su = sc.nextInt();
		
		if(su % 3 != 0) {
			System.out.println(su);
		}else if(su % 3 == 0 && su % 5 == 0) {
				System.out.println(su);
			}
		
		
	}

}
