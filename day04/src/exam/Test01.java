package exam;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�Է��� �����Ͱ� 3�� ����� ��� ����Ͻÿ�
			
			System.out.print("�ϳ��� ���� �Է��ϼ��� : ");
			int su1 = sc.nextInt();
			
			if(su1 % 3 == 0) {
				System.out.println(su1 + "�� 3�� ����Դϴ�.");
			}else {
				System.out.println(su1 + "�� 3�� ����� �ƴմϴ�.");
			}
		
		
	}

}
