package exam;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//���� �Է¹޾� ¦,Ȧ���� �����Ͽ� ����Ͻÿ�
			
			System.out.print("�ϳ��� ���� �Է��ϼ��� : ");
			int su2 = sc.nextInt();
			
			if(su2 % 2 == 0) {
				System.out.println(su2 + "�� ¦���Դϴ�.");
			}else if(su2 % 2 != 0){
				System.out.println(su2 + "�� Ȧ���Դϴ�.");
			}
		
		
	}

}
