package exam;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// ���� �ڵ�� �� ���� ������ �Է� �޾� ������ ����� ���ϰ�
		// �����
		// 90�̻��̸� A,
		// 80�̻��̸� B,
		// 70�̻��̸� C,
		// 60�̻��̸� D,
		// �� �ܿ��� F�� ����ϴ� ���α׷��̴�.
		// ���� ����� ������ �ִµ� ������ ã�� �ش� �κ��� �����Ͻÿ�.

		Scanner sc = new Scanner(System.in);

		System.out.print("���������� �Է��ϼ��� : ");
		float kor = sc.nextFloat();

		System.out.print("���������� �Է��ϼ��� : ");
		float eng = sc.nextFloat();

		System.out.print("���������� �Է��ϼ��� : ");
		float mat = sc.nextFloat();

		float total = kor + eng + mat;
		float avg = total / 3.0f;
		char grade = 0;

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("����:" + String.format("%.2f", total) + "��");
		System.out.println("���:" + String.format("%.2f", avg) + "��");
		// format �޼���� ���ڿ��� ������ �����ϴ� �޼���(�Ҽ��� 0.2 �κб����� ���)
		System.out.println("���:" + grade);

	}

}
