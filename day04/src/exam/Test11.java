package exam;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// �� ������ ������ �Է¹޾� �հ�� ����� ���ϰ� ����� 90�� �̻��̸� "A"
		// 80�� �̻��̸� "b", 70�� �̻��̸� "C",
		// 60�� �̻��̸� "D", 60�� �̸��̸� "F"�� ����Ͻÿ�

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int mat = sc.nextInt();
		
		int total = kor + eng + mat;
		int average = total / 3;
		
		if(average >= 90) {
			System.out.println("A����" );
		}else if(average >= 80) {
			System.out.println("B����" );
		}else if(average >= 70) {
			System.out.println("C����" );
		}else if(average >= 60) {
			System.out.println("D����" );
		}else {
			System.out.println("F����");
		}


	}

}
