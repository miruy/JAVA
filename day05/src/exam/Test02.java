package exam;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
	// ������ �г��� �Է¹޾� 60�� �̻��̸� ���, �̸��̸� �����̴�.(1~4�г�)
	// ��, 4�г��� 70�� �̻��� ����̸� 65�� �̻��� ���, 65�����ϴ� ������ �����Ѵ�.
		Scanner sc = new Scanner(System.in); 
		
		int score = 0;
		int grade = 0;
		String green = "���";
		String yellow = "���";
		String red = "����";
				
		System.out.print("�г��� �Է��ϼ��� : ");
		grade = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		score = sc.nextInt();
		
		if(grade < 4) {
			if(score >= 60) {
				System.out.println(green);
			}else {
				System.out.println(red);
			}
		}else if(score >= 70) {
			System.out.println(green);
		}else if(score >= 65) {
			System.out.println(yellow);
		}else {
			System.out.println(red);
		}
		

	}

}
