package exam;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		//���� 1�뿡 500���Ѵ�.
		//�׷��� �ѹ��� 10�� �̻��� ��� ��ü �ݾ��� 10%�� �������ش�.
		//�׸��� 100�� �̻��� ��� ��ü �ݾ��� 12%�� �������ش�.
		//X���� ������ ����� �󸶰� �־�� �ϴ°�?
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("������ ���� ���� : ");
		int discat = sc.nextInt();
		
		int money =  discat*500;
		
		if(discat >= 100) {
			System.out.println("���ε� �ݾ� : " + money / 12);
			System.out.println("�����ϱ� ���� �ʿ��� �ݾ� : " + (money -(money / 12)));
		}else if(discat >= 10) {
			System.out.println("���ε� �ݾ� : " + money / 10);
			System.out.println("�����ϱ� ���� �ʿ��� �ݾ� : " + (money -(money / 10)));
		}else {
			System.out.println("�����ϱ� ���� �ʿ��� �ݾ� : " + money);
		}
		
		
		
	}

}
