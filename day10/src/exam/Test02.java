package exam;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// �ֹε�Ϲ�ȣ �����ϱ�(String���� �Է¹ޱ�)
		Scanner sc = new Scanner(System.in);

		int[]id = new int[12];  
		int[]su = {2,3,4,5,6,7,8,9,2,3,4,5};
		int gob = 0; 
		int hap = 0;  
		int veri = 0;
		

		System.out.print("������ �ڸ��� ���� ���ڸ� �Է� : ");
		String stringid = sc.nextLine();

		for (int i = 0; i < id.length; i++) {
			id[i] = Integer.parseInt(Character.toString(stringid.charAt(i)));
		}

		for (int i = 0; i < id.length; i++) {

			gob = id[i] * su[i];
			hap += gob;
			veri = 11 - (hap % 11);
			if (veri == 11) {
				veri = 1;
			} else if (veri == 10) {
				veri = 0;
			}
		}
		System.out.println("������ȣ : " + veri);

	}

}
