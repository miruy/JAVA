package exam;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		//������ ����
		//4�� ������ �������� �ش� ����, �� ���� �ش� ������� �Ѵ�.
		//4�� ������ ���������� 100���ε� ������ �������� �ش� ������� �Ѵ�.
		//��, 400���� ������ �������� �ش� �������� �Ѵ�.(�� : 2000��, 2400��)
		
		//�Է� : 2004
		//��� : ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
	
		if(year % 4 == 0) {
			if(year % 400 == 0){
				System.out.println("����");
			}else if(year % 100 == 0) {
				System.out.println("���");
		}else{
				System.out.println("����");
			}	
		}
		

	}

}
