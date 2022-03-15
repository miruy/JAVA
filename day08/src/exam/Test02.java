package exam;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 하나의 수를 입력받아 n!을 구하라(팩토리얼)
		// 규칙 1*2*3*4*5.....*n
		// ex) 입력 : 4, 출력 : 4!은 24이다.
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int su = sc.nextInt();
		
		int i = 1;
		int sum = 1;
		
		while(i <= su) {
				sum *= i;
				i++;
		}
		System.out.print(su + "!은 " + sum + "이다.");

	}

}
