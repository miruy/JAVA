package exam;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		/*
		 ����ڷκ��� 2���� ���ڸ� �Է¹޾� �� ���� ���� �˷��ִ� ���
		 */
		//�� ��������� ���� �ΰ� �Է� �޾�
		Scanner keyboard = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է����ּ���:");
		int n1 = keyboard.nextInt();
		System.out.print("���� �ϳ� �Է����ּ���:");
		int n2 = keyboard.nextInt();
		
		//�׸��� �װ� �ΰ� ����
		int result = n1 + n2;
		
		//��� �˷����
		System.out.println(n1 + "+" + n2 + "=" + result);
	}
}
