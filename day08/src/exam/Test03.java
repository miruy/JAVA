package exam;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// �Է¹��� ���� �Ųٷ� ����ض�
		// ex) �Է� : 123, ��� : 321

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int su =sc.nextInt();
		
		do {
			System.out.print(su % 10);    //(1)3		(2)2 	   (3)1
			
			su = su / 10;                 //(1)su = 12  (2)su = 1  (3)su = 0.1 ��
			
			} while (su > 0);

			
		
		
		
		
	}
}
