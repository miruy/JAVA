package exam;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// ����ǥ ����� 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("100�� ~ 95�� : 1 , 90�� ~ 94�� : 2");
		System.out.println("89�� ~ 85�� : 3 , 80�� ~ 84�� : 4");
		System.out.println("79�� ~ 75�� : 5 , 70�� ~ 74�� : 6");
		System.out.println("69�� ~ 65�� : 7 , 60�� ~ 64�� : 8");
		System.out.println("60�� ~ : 9");
		System.out.println();
		System.out.println("�ڽ��� ������ ���ϴ� ��ȣ�� �Է��ϼ��� : ");
		
		int score = sc.nextInt();
		
		switch(score){
		case 1 : 
			System.out.println("������ A+ �Դϴ�.");
			break;
		case 2 : 
			System.out.println("������ A �Դϴ�.");
			break;
		case 3 : 
			System.out.println("������ B+ �Դϴ�.");
			break;
		case 4 : 
			System.out.println("������ B �Դϴ�.");
			break;
		case 5 : 
			System.out.println("������ C+ �Դϴ�.");
			break;
		case 6 : 
			System.out.println("������ C+ �Դϴ�.");
			break;
		case 7 : 
			System.out.println("������ D+ �Դϴ�.");
			break;
		case 8 : 
			System.out.println("������ D �Դϴ�.");
			break;
		case 9 : 
			System.out.println("������ F �Դϴ�.");
			break;
		}
		
		
	}

}
