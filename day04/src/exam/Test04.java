package exam;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�� ���� �Է¹޾� ū ���� ¦���̸� ����Ͻÿ�
		
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		int su1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int su2 = sc.nextInt();
		
		if(su1 > su2) {
			if(su1 % 2 == 0) {
				System.out.println("�� �� �� ũ�� ¦���� �� : "+ su1);
			}
		}else if(su2 > su1) {
			if(su2 % 2 == 0) {
				System.out.println("�� �� �� ũ�� ¦���� �� : "+ su2);
			}
		}
	

	}

}
