package Exam;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// ������ �����ϴ� �迭�� ���Ѵ�� �þ���� �ۼ�
		Scanner sc = new Scanner(System.in);

		int size = 3;
		int[] array = new int[size];
		int[] array2 = new int[size];

		while (true) {    //���� �Է�
			for (int i = 0; i < size; i++) {   //�ʱ� ���� 3��ŭ �ݺ�

				System.out.printf("�Է� (���� ���� : %d): ", size);
				array[i] = sc.nextInt();     //array[i]�� ����

				if (i == size - 1) {   //�Է��� 2������ �޾Ҵٸ� 
					for (int j = 0; j < size; j++) {   //array[j] = array[i] (i,j�� ���ڷκ����� ���� �ε���)
						array2[j] = array[j];       //array�ε����� array2�ε����� �ű�ڴ�(����)
					}
					size += 3;    //size ���� �ø� (�����Է��� ���� )
					array = new int[size];    //array[] ���̴� 6�̵� size�� ���� �� ���ÿ� ���� �迭 ����

					for (int j = 0; j < size - 3; j++) {
						array[j] = array2[j];           //���� ���� ������� �ݺ�
					}

					array2 = new int[size];

				}
				for (int j = 0; j <= i; j++) {     
					System.out.print(array[j] + ",");
				}
				System.out.println();
			}
		}

	}

}
