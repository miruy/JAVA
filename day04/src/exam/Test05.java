package exam;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�μ��� �Է¹޾� ���� ¦���̰� 3�� ����̸� ����Ͻÿ�
		
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		int su1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int su2 = sc.nextInt();
		
		int hap = su1 + su2;
		
		if(hap % 2 ==0) {
			if(hap % 3 == 0) {
				System.out.println("�� ���� ���� 3�� ����Դϴ�.");
			}else {
				System.out.println("�� ���� ���� 3�� ����� �ƴմϴ�.");
			}
		}


	}

}
