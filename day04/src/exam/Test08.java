package exam;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		//���������� ���� �¿��ִµ� ó�� 30���� �⺻����� 1�δ� 3000���̴�. 
		//���� ���� 10�д� 500������ �߰������ �޴´�.
		//���� ź �ð��� �Է¹޾Ƽ� ��ü �ݾ��� ����ϴ� ���α׷����� �ۼ��Ͽ���.

		Scanner sc = new Scanner(System.in);
		
		int baseTime = 30;
		int baseRate = 3000;
		int addTime = 10;
		int addTimeRate = 500;
		int addTotalRate; 
	
		
		System.out.print("���� ź �ð� : ");
		int time = sc.nextInt();
		
		if(time <= 39) {
			System.out.println("��� : " + baseRate);
		}else if (time % 10 == 0){
			addTotalRate = (time-30)/10*500+3000;
			System.out.println("��� : " + addTotalRate);
		}	
		
	}

 }
