package exam;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//�ֹε�Ϲ�ȣ �����ϱ�
		Scanner sc = new Scanner(System.in);
		
		int[]id = new int[12];
		int[]su = {2,3,4,5,6,7,8,9,2,3,4,5};
		int hap = 0;
		int gob;
		int veri = 0;
		
		for(int i = 0; i < id.length; i++) {
			System.out.println("������ �ڸ� �� ���� 12�ڸ��� �Է��ϼ���.");
			System.out.print(i + 1 + "��° �ֹε�Ϲ�ȣ �Է� : ");
			id[i] = sc.nextInt();
			gob= id[i]*su[i];
			
			hap += gob;
			veri = 11-(hap % 11);
			if(veri == 11) {
				veri = 1;
			}else if(veri == 10) {
				veri = 0;
			}
		}
		System.out.println("������ȣ : " + veri);
		
		
		
		
		
		
		
		
		
		
	}

}
