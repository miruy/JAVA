package exam;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// ���� ���� �������α׷�
		// ���� ������ ���� ������ �Է¹޾� String������ 2���� �迭�� ����
		Scanner sc = new Scanner(System.in);

		int select;
		int floor = 0;
		int room = 0;
		String name = " ";

		System.out.print("��� �� : ");
		int allFloor = sc.nextInt();
		System.out.print("��� �� : ");
		int allRoom = sc.nextInt();
		boolean oc = true;
		String[][] info = new String[allFloor][allRoom];
		
		while(oc) {
			System.out.print("1.�Խ�   2.���   3.��ü����   4.����  :  ");
			select = sc.nextInt();
			if (select == 1) {
				System.out.print("������ �Խ� : ");
				floor = sc.nextInt();
				System.out.print("����濡 �Խ� : ");
				room = sc.nextInt();
				System.out.print("������ �̸� : ");
				name = sc.next();
				info[floor][room] = name;
			} else if (select == 2) {
				System.out.print("��� �� : ");
				floor = sc.nextInt();
				System.out.print("��� �� : ");
				room = sc.nextInt();
				System.out.println(floor + "��" + room + "���� ��� ó�� �Ǿ����ϴ�.");
				info[floor][room] = null;
			} else if (select == 3) {
				for (int i = 0; i < info.length; i++) {
					System.out.println(i +1+ "��");
					for (int j = 0; j < info[i].length; j++) {
						System.out.print(j+ "���� ������ : " + info[i][j]+"\n");
					}
					continue;
				}
			} else {
				System.out.println("���ھ��� ���� ���α׷��� �����մϴ�.");
				oc = false;
			}

		}

	}
}
