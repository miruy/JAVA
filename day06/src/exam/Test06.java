package exam;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// ����ڷ� ���� 10���� ������ �Է¹޾� ����� ���ϼ���
		
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		int sum = 0;
		int avg;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "��° �� �Է� : ");
			su = sc.nextInt();
			sum += su;
		}
		
		avg = sum / 10;
		
		System.out.println(sum);
		System.out.println(avg);
		

	}

}
