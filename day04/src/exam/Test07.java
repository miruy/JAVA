package exam;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�� ���� �Է¹޾� ū ���� ����Ͻÿ� 
		
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		int su1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int su2 = sc.nextInt();
		
			//int ret;
		if(su1 > su2) {
			//ret = n1;
			System.out.println("�� �� �� ū �� : " + su1);
		}else {
			//ret = n2;
			System.out.println("�� �� �� ū �� : " + su2);
			//System.out.println(ret);
		}
		
		
	}

}
