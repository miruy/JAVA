package exam;

import java.io.IOException;
import java.util.*;

public class Test01 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		//char ex = (char)System.in.read();
		//Ű����κ��� �Էµ� �� ����(1byre)�� �о����
		//ĳ���� : ������ ���¸� ��ȯ �ؾ��� �� �ڷ����� ����ϴ� �� (ū�Ϳ��� ���� ������ ����)
		
		//1. �ڽ��� �̴ϼ� (String/char)�� �Է¹޾� ����Ͻÿ�
		
			System.out.print("�����̸��� �Է��ϼ��� : ");
			
			String engName = sc.nextLine();
			System.out.println("�Է��Ͻ� �����̸� : " + engName);
			
			char ch = engName.charAt(0);
			System.out.print("�̴ϼ� : " + ch);
			System.out.print(engName.charAt(3));
			System.out.println(engName.charAt(5));
			
			System.out.println();
		//2. 3������ ������ �Է¹޾� �հ�� ����� ���Ͻÿ�
			
			System.out.print("���������� �Է��ϼ��� : ");
			int kor = sc.nextInt();
			
			System.out.print("���������� �Է��ϼ��� : ");
			int eng = sc.nextInt();
			
			System.out.print("���������� �Է��ϼ��� : ");
			int math = sc.nextInt();
			
			int total = kor + eng + math;
			
			int average = total / 3;
			
			System.out.println("3������ �� : " + total);
			System.out.println("3������ ��� : " + average);
			
			sc.nextLine();
		/*3. ������ ���� �����͸� �Է¹޾� ����Ͻÿ�
		 * ����� �̸��� �����Դϱ�?  ȫ�浿
		 * ȫ�浿���� ���̴� �� ���Դϱ�? 18
		 * ȫ�浿���� ���̴� 18���Դϴ�.
		 */
			
			System.out.print("����� �̸��� �����Դϱ�?");
			String name = sc.nextLine();
			
			System.out.print(name + "���� ���̴� �� �� �Դϱ�?");
			int age = sc.nextInt();
			
			System.out.println(name + "���� ���̴� " + age + "�� �Դϴ�.");
			
			
	}

}
