package exam;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// �ϳ��� ���� �Է¹޾� n!�� ���϶�(���丮��)
		// ��Ģ 1*2*3*4*5.....*n
		// ex) �Է� : 4, ��� : 4!�� 24�̴�.
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int su = sc.nextInt();
		
		int i = 1;
		int sum = 1;
		
		while(i <= su) {
				sum *= i;
				i++;
		}
		System.out.print(su + "!�� " + sum + "�̴�.");

	}

}
