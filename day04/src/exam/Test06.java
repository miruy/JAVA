package exam;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//���� �Է¹޾� ����Ͻÿ�(��, 3�� ����� �����ϰ� 3�� ����̸鼭 5�� ����� ���� ���)
		
		System.out.print("���� �Է��ϼ��� : ");
		int su = sc.nextInt();
		
		if(su % 3 != 0) {
			System.out.println(su);
		}else if(su % 3 == 0 && su % 5 == 0) {
				System.out.println(su);
			}
		
		
	}

}
