package Exam;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// �ߺ� ���� �Է��ϸ� �ߺ�!�� �߷��ϰ� ���� �������� �ʰ� �ض�
		Scanner sc = new Scanner(System.in);

		int[] arr;   //���� ���� ���������� ����

		int[] add = {0,0,0};  //000���� �ʱ�ȭ �� ���� 3��¥�� �迭
		for(int j=3; ;j+=3) { //3 6 9 12 ... ���� 3���� �����ؼ� �������� �ݺ����� 
			arr = new int[j];  //���� ���� ���� arr ���������� ���ѷ���j�� ���̷� ���� = arr�� ���ѷ�������
			for(int d = 0; d<arr.length; d++) { //d�� ���ѷ��� ������
				arr[d] = add[d];  // ���ѷ��� ���� ������ ���� arr�� add�迭�� ���� 
			}
		
			for(int i =j-3; i<arr.length; i++) {//0 3 6 9 ~ �迭���̸�ŭ
				System.out.print("�Է� (�������:"+j+") : ");
				arr[i] = sc.nextInt();
				for(int l = 0; l<add.length; l++) {
					if(arr[i] == add[l] ) {
						System.out.println("�ߺ�!");	
						i--;
						break;
					}
				}					
				for(int k = 0; k<=i; k++) { //0~�迭���̸�ŭ
					System.out.print(arr[k]+", ");
				}
				System.out.println();
				
			}
			
			
			System.out.println("������("+(j+3)+")");
			add = new int[j+3];
			for(int d = 0; d<arr.length; d++) {
				add[d] = arr[d];
			}
	
		}

		
		
		
		
		
		
		
	}

}
