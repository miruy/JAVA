package exam;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// �� ���� �Է¹޾� �� �� ������ ���� ���Ͻÿ� (�� : 0 ~ 11 = 55)
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("ù��° ���� �Է� : ");
		int su1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int su2 = sc.nextInt();
		
		for(int i = su1; i < su2; i++) {
			sum += i;
		}
		System.out.println(su1 + " ~ " + su2 + " = " + sum);
		

	}

}
