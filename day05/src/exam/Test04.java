package exam;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// �޴��� ����� �������α׷� ����� 
		/* 1. �л� ���
		 * 2. ����, ����, ���� ���� �Է�
		 * 3. �л� �̸� ���
		 * 4. ���� ���
		 * 5. ��� ���
		 * 6. ���� 
		 */
		String name = " ";
		int kor = 0;
		int eng = 0;
		int mat = 0;
		int total = kor + eng + mat;
		int avg = total / 3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л� �������α׷��� ����Ͻðڽ��ϱ�?");
		System.out.println("�̸� ��� : 1 , ���� ��� : 2 , �л� �̸� ��� : 3");
		System.out.println("���� ��� : 4 , ��� ��� : 5 , ���� : 6");
		System.out.print("�Է� : ");
		int answer = sc.nextInt();
		sc.nextLine();
		switch(answer) {
		case 1 : 
			System.out.print("����� �̸��� �Է��ϼ��� : ");
			name = sc.next();
			break;
		case 2 : 
			System.out.print("���������� �Է��ϼ��� : ");
			kor = sc.nextInt();
			System.out.print("���������� �Է��ϼ��� : ");
			eng = sc.nextInt();
			System.out.print("���������� �Է��ϼ��� : ");
			mat = sc.nextInt();
			break;
		case 3 :
			System.out.println("��ϵ� �л� : " + name);
			break;
		case 4 : 	
			total = kor + eng + mat;
			System.out.println("���� : " + total);
			break;
		case 5 :	
			avg = total / 3;
			System.out.println("��� : " + avg);
			break;
		case 6 :	
			System.out.println("�� ��");
		default : 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		

	}

}
