package exam;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 입력받은 수를 거꾸로 출력해라
		// ex) 입력 : 123, 출력 : 321

		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int su =sc.nextInt();
		
		do {
			System.out.print(su % 10);    //(1)3		(2)2 	   (3)1
			
			su = su / 10;                 //(1)su = 12  (2)su = 1  (3)su = 0.1 끝
			
			} while (su > 0);

			
		
		
		
		
	}
}
