package exam;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// ���� �Է¹޾� �ش� ���� �ϼ��� �����ִ� ���α׷�
		// 1,3,5,7,8,10,12�� : 31��
		// 4,6,9,11�� : 30��
		// 2�� : 28��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("31��");
			break;
		case 4 : 	
		case 6 : 
		case 9 : 
		case 11 :
			System.out.println("30��");
			break;
		case 2 :
			System.out.println("28��");
			break;
			
		
		}
				
	}

}