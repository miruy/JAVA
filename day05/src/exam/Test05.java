package exam;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// ���� �ΰ��� �Է¹޾� ��Ģ������ �ϴ� ���� �����
		/* ������ �Է� : +
		 * ù��° �� �Է� : 1
		 * �ι�° �� �Է� : 2
		 * ��� 1+2=3
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �� �Է� : ");
		int su1 = sc.nextInt();
		System.out.print("������ �Է� : ");
		String cal = sc.next();
		System.out.print("�ι�° �� �Է� : ");
		int su2 = sc.nextInt();
		
		
		switch(cal) {
		case "+" :
			System.out.println(su1 + " + " + su2 + " = " + (su1+su2));
			break;
		case "-" :
			System.out.println(su1 + " - " + su2 + " = " + (su1-su2));
			break;
		case "*" :
			System.out.println(su1 + " * " + su2 + " = " + (su1*su2));
			break;
		case "/" :
			System.out.println(su1 + " / " + su2 + " = " + (su1/su2));
			break;
		case "%" :
			System.out.println(su1 + " % " + su2 + " = " + (su1%su2));
			break;	 
		
		}
	}

}
