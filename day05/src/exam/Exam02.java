package exam;

import java.util.Scanner;

/* switch ~ case ����
 * (�ٲٴ�)  (���,���)
 * �������� ����. �ش���ġ "����" �����Ѵ�.(�տ� �ǳʶٰ�)
 * 
 * switch(����){
 * case ���1:
 * 		����;[break]
 * case ���2:
 * 		����;
 * default;
 * 		����;
 * }
 */

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.next();
		
		switch(str){
		case "hello" : 
			System.out.println("1");
			break;
		case "�ȳ��ϼ���" : 
			System.out.println("2");
			break;
		case "hi" : 
			System.out.println("3");
			break;
		default : 
			System.out.println("��ġ�Ǵ� case�� ����");
		}
		
		//switch ���� String�� Ȱ���� �� �ִ� ����
		//��ü�� ��� �ؽ��ڵ带 ���´�.
		//String�� ������ ���ڿ��� �̿��Ͽ� hashCode���� ������� 
		System.out.println("hello".hashCode());
		System.out.println(str.hashCode());
		
		
		
		
		

	}

}
