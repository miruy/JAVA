package exam;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] age = new int [5];
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(i + 1 + "��° ���� �Է�");
			System.out.print("�̸� : ");
			name[i] = sc.nextLine();
			System.out.print("���� : ");
			age[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("_________________");
		
		int imsi1;
		String imsi2;
		
		for(int i = 0; i < age.length; i++) {
			for(int j = i+1; j < age.length; j++) {
				if(age[i] > age[j]) {
					imsi1 = age[i];
					age[i] = age[j];
					age[j] = imsi1;
					imsi2 = name[i];
					name[i] = name[j];
					name[j] = imsi2;
				}
				
			}
		}
		for(int i = 0; i < age.length; i++) {
			System.out.println(i + 1 + "��° ����");
			System.out.println("�̸� : " + name[i]);
			System.out.println("���� : " + age[i]);
		}
		
		
		
	}

}
