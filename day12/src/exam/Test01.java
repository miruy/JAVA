package exam;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// ������ �迭�� �� �迭�� ���̸� �ٸ��� �Ҵ��� �� �ִ�.
		// �Է¹��� �� ��ŭ ���� �迭 �Ҵ�
		// �Ҵ�� �����迭�� ���� ���̸� �ٸ��� �Է� �޾� �迭 �Ҵ�
		// ���� 0���� �ڵ��Է� �� ���

		int arrCount1;              //ó�� ������ �迭�� ���̸� �Է¹��� ���� ����

		Scanner sc = new Scanner(System.in);

		System.out.print("�� ���� �迭�� ����ðڽ��ϱ�?");
		arrCount1 = sc.nextInt();
		System.out.println("�� ���� �迭�� ���弼��!");

		int[][] arr = new int[arrCount1][];           //arr�̶�� ���������� ���� �迭�̸� ���̴� arrCount1(�Է°�)�̰� �� �迭���̴� ���� ����
		int arrCount2;	                              //�Է¹��� ù �迭�ȿ� ���� �ι�° �迭�� ���̸� �Է¹ޱ� ���� ���� ����

		for (int i = 0; i < arr.length; i++) {        //arr�� ���� = arrCount1(�Է°�)��ŭ �ݺ��� 
			System.out.print(i + 1 + "��° ���� �迭 : ");  
			arrCount2 = sc.nextInt();				
			arr[i] = new int[arrCount2];              //arr�� i��°(�ݺ����� ���� 0.1.2...�ö�)�ε����� arrCount2�� ���̸� ���� �迭�� ���� ������ 
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {  //�� ���忡�� ���ϴ� arr[i]�� ���̴� �ݺ��ϸ� ���� ������ arrCount2���� 

				System.out.print(j + " ");  //arr[i]�� ���̸� 0,1.2,3...�� ����ϱ����� j�� ��¹��� ��
			}
			System.out.println();
		}

	}
}
