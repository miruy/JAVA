package exam;

import java.util.Scanner;

/*
 * �ݺ��� : do ~ while
 * while ���� ���� ������ �տ� �־ �켱 ���� �� ������������� ���Ǻ��� ������ 
 * ���ӹ����� �ּ� �ѹ� ������ 
 * 
 * 
 */
public class Exam04 {

	public static void main(String[] args) {
		//���� ���� ���� �Է�
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		while(true) {
			System.out.print("�� �Է�()~100) : ");
			n = sc.nextInt();
			if(n >= 0 && n <= 100) {
				break;
			}
		}
		System.out.println(n);
		
		
		n = 0;
		do {
			System.out.print("�� �Է�()~100) : ");
			n = sc.nextInt();
		}while(!(n >= 0 && n <= 100));
		System.out.println(n);
		
		
		
	}
}
