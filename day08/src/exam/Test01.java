package exam;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// ����, ����, ���� ���� ������ �Է¹޾� ����, ���, ������ ����ϼ���
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� : ");
		int mat = sc.nextInt();
		
		int total = kor + eng + mat;
		int avg = total / 3;
		char grade = ' ';
		
		while(true) {
			if(avg >= 90 || avg <= 100) {
				grade = 'A';
				break;
			}else if(avg >= 80) {
				grade = 'B';
				break;
			}else if(avg >= 70) {
				grade = 'C';
				break;
			}else if(avg >= 60) {
				grade = 'D';
				break;
			}else{
				grade = 'F';
				break;
			}
			
		}
		
		System.out.print("���� : " + total + "��, ��� : " + avg + "��, ���� : " + grade);

	}

}
