package exam;

/*
 * ����, ���, �ڷ���?
 * ���� ����ִ� �޸� ����!
 * 	������ ������ ����ִ� ���� ������ �� �ְ�
 * 	����� ������ �� ����
 */

public class Exam03 {
	public static void main(String[] args) {
		//���� ����(���� Ȯ��)
		// �ڷ��� ������; => �ʱⰪ: �����Ⱚ
		// �ڷ��� ������ = ��; �ʱ�ȭ(������ ���ʰ��� �����ϴ� ��)
		// = ���� ������!: ������ ���� ����� ���ʿ� ����(����)
		boolean b = true;
		byte n1 = 10; //1byte
		short n2 = 20;  //2byte
		char n3 = 65;   //2byte
		int n4 = 432141233;  //4byte (���� �⺻�ڷ�)
		long n = 42152313434213213L;  //8byte
		float n5 = 3.14f;  //4byte
		double n6 = 3.14;  //8byte(������, �Ǽ� �⺻�ڷ�) 
		
		System.out.println(b);
		System.out.println(n);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		n4 = 100; //���� ����
		System.out.println(n4);
		
	}
}

