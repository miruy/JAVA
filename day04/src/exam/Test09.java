package exam;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		//��� ���ö��� �ֹ��ϴµ� 10�������� ���� 2500���̰�
		//10���� �ʰ��ϴ� �翡 ���ؼ��� ���� 2400���̴�.
		//��� ���ö��� ������ �Է� �޾Ƽ� �ݾ��� ����ϴ� ���α׷��� �ۼ��϶�
		
		Scanner sc = new Scanner(System.in); 
		
		int baseRate = 2500;
		int addRate = 2400;
		
		System.out.print("������ ���ö� ���� : ");
		int dosirac = sc.nextInt();
		
		if(dosirac <= 10) {
			System.out.println("�ݾ� : " + dosirac * baseRate);
		}else {
			System.out.println("�ݾ� : " + dosirac * addRate);
		}
	}

}
