package exam;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// Ű�� 110cm�̻� �Ͻ� ��� Ʈ�����͸� ž�°����ϴ�.
		// Ű�� 110cm���� �϶� ��ȣ�ڰ� ���� �ִ��� üũ�Ѵ�.
		// ��ȣ�� ���� ���� �� ž�� ����, ���� �� ž�� �Ұ���
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		int height = sc.nextInt();
		
		if(height >= 110) {
			System.out.println("ž�� ����");
		}else {
			System.out.println("��ȣ�ڰ� ���� �ֳ���?");
			System.out.println("�ִ� : 1, ���� : 2");
			int answer = sc.nextInt();
					if(answer == 1) {
						System.out.println("ž�°���");
					}else {
						System.out.println("ž�� �Ұ���");
			}
		}
		

	}

}
