package exam;

import java.util.Scanner;

/*
 * �ڹٿ��� �迭�� ����(runtime)���� ������
 * �����߿� ��ü�� ������� 
 * 
 */
public class Exam08 {

	public static void main(String[] args) {
		//������ �ϴ� ������ �迭�� ������ ���� �� ���ٸ�?
		Scanner sc = new Scanner(System.in);
		
		int[]arr = null;
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
