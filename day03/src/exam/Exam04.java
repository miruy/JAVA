package exam;

import java.util.Scanner;  //�ٸ� ��Ű���� Ŭ������ ����Ѵٰ� ������ �� 

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� �Է�
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();  
		System.out.println("�Է��� �� : " + n);
		//�Ǽ� �Է�
		System.out.print("�Ǽ� �Է� : ");
		double f = sc.nextDouble();
		System.out.println("�Է��� �� : " + f);
		
		//��ġ�� �Է� �� ���ڿ� �Է��� �ʿ��� ��� ���๮�ڸ� �������ش�! 
		sc.nextLine();  //�ѹ� �� nextLine�� �������ν� ���͸� �������� 
		
		//���� �Է�
		
		//���ڿ�
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine(); //����(����)���� �о� �� ����� ���� �� ������ �� ����� �����ϴ� �ý��� 
		System.out.println("�Է��� �� : " + str);
		
		char ch = str.charAt(0); 
		System.out.println(ch); //���ڿ��� �ε��� 
		System.out.println(str.charAt(1)); //���ڿ��� �ε��� 
		
		//���Ϲ���
		System.out.print("���� �ϳ� �Է� : ");
		char cha = sc.nextLine().charAt(0);
		System.out.println("�Է��� �� : " + cha);
	}
}
