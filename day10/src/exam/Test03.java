package exam;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// �ֹε�Ϲ�ȣ �����ϱ�
		// ������ �������� Ȯ���ϱ�
		// bigArea, midArea, smallArea �� ���ǻ� 2���� ����
		Scanner sc = new Scanner(System.in);

		String[] idNum = {"000000-0000000"};
		int[] year = new int[4];
		int month;
		int day;
		int gender = 0;
		int bigArea = 0; // ��
		int midArea = 0;
		int smallArea = 0; // ��
		int[] dobong = { 5, 6 };
		int[] bundang = { 6, 7 };
		int[] changdong = { 8, 9 };
		int[] eunheng = { 9, 8 };
		
		for(int i = 0; i < idNum.length; i++) {
		 
		}

		System.out.print("�¾ �⵵ �Է� : ");
		for(int i = 0; i < year.length; i++) {
			year[i] = sc.nextInt();
		}

		System.out.print("�¾ �� �Է� : ");
		month = sc.nextInt();

		System.out.print("�¾ �� �Է� : ");
		day = sc.nextInt();
		sc.nextLine();

		System.out.print("���� �Է� : ");
		String stringgender = sc.nextLine();
		if (stringgender.equals("����")) {
			gender = 1;
		} else if (stringgender.equals("����")) {
			gender = 2;
		}

		System.out.println("��1) ����Ư����, ��⵵ ������");
		System.out.print("��� ��/�� �Է� : ");
		String stringBigArea = sc.nextLine();
		if (stringBigArea.equals("����Ư����")) {
			bigArea = 3;
		} else if (stringBigArea.equals("��⵵ ������")) {
			bigArea = 4;
		}
		System.out.println("��1) ������, �д籸");
		System.out.print("��� �� �Է� : ");
		String StringMidArea = sc.nextLine();
		if (StringMidArea.equals("������")) {
			for (int i = 0; i < dobong.length; i++) {
				midArea = dobong[i];
			}
		} else if (StringMidArea.equals("�д籸")) {
			for (int i = 0; i < bundang.length; i++) {
				midArea = bundang[i];
			}
		}

		System.out.println("��1) â��, ���ൿ");
		System.out.print("��� �� �Է� : ");
		String stringSmallArea = sc.nextLine();
		if (stringSmallArea.equals("â��")) {
			for (int i = 0; i < changdong.length; i++) {
				smallArea = changdong[i];
			}
		} else if (stringSmallArea.equals("���ൿ")) {
			for (int i = 0; i < eunheng.length; i++) {
				smallArea = eunheng[i];
			}
		}
		sc.nextLine();

		System.out.print("�ֹε�Ϲ�ȣ ���� : ");
		System.out.printf("%d%d%d%d%d%d - %d%d%d%d%d%d%d", year[2],year[3], month, day, gender, bigArea, midArea, smallArea);

	}

}
