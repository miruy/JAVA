package Exam;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		int size = 3;
		String[] array = new String[size];	// ��벯
		String[] array2 = new String[size];	// �����

		Scanner sc = new Scanner(System.in);
//��Ʈ�� ����Ʈ B & �κ� ���� ���� ���콺 ��� ���� ����Ŭ��
		while (true) {
			for (int i = 0; i < size; i++) {
				System.out.printf("�Է� (���� ���� %d): ", size);
				array[i] = sc.nextLine();
				if (i == size - 1) {
					for (int j = 0; j < size; j++) {
						array2[j] = array[j];
					}

					size += 3;

					array = new String[size];

					for (int j = 0; j < size - 3; j++) {
						array[j] = array2[j];
					}

					array2 = new String[size];
				}
				for (int j = 0; j <= i; j++) {
//					System.out.println(array[j] + ",");
					System.out.printf("%s,  ",array[j]);
				}
				System.out.println();
			}
		}

	}
}
