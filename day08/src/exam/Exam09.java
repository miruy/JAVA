package exam;

import java.util.Random;

public class Exam09 {

	public static void main(String[] args) {
		Random ran = new Random();  //�������� ����(����)�� ó���� �� ����
		
		for(int i = 0; i < 5; i++) {
 			int n = ran.nextInt(100);  //0~99
			System.out.println(n);
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			int n = ran.nextInt(100) + 1;  //1~100
			System.out.println(n);
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			int n = ran.nextInt(45) + 1; //1~45
			System.out.println(n);
		}
		//1~45 ������ ���� ���� ����� Ȱ���Ͽ�
		//�ζ� ���� ��ȣ�� ����ϴ� ���α׷� ����� (�迭���� �����)
		//6���� ���� 
		
	}
}
