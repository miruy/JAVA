package exam;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// ������ �迭�� ���̸� �Է¹ް�
		// ���� ��ŭ ���� �Է¹ް�
		// �ش� �迭 �����ϱ�

		int[] array = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �迭�� ���� �Է� : ");
		int arrayLength = sc.nextInt();
		System.out.println(arrayLength + "���� �迭�� �����Ǿ����ϴ�. ");

		array = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			System.out.print(i + 1 + "��° ���� �Է��ϼ��� : ");
			array[i] = sc.nextInt();
		}

		System.out.print("�迭�� �Էµ� ���� ");
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println("�Դϴ�.");

		int imsi1;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					imsi1 = array[i];
					array[i] = array[j];
					array[j] = imsi1;
				}
			}
		}
		System.out.print("���� �� ���� ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.print("�Դϴ�.");
	}

}
