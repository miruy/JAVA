package exam;

public class Test02 {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 10;
		int d = 0;
		
		boolean bo = false;
		
		d = ++a * b--;		
		System.out.printf("a = %d, b = %d, d = %d\n",a,b,d);

		d = a++ + ++c - b--;
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a,b,c,d);
		
		a = 1;
		b = 0;
		
		// || �� && �� ���Ե� ������ ��� ���ʺ��� ������ ����Ǵµ�
		//�̶� ���������� ����� �������� ������ ���� ��ü�� ������ ���ϰ� �״�� ��
		//���� �ؿ� c,d�� ����� �� �� �� �״�� ��µ� 
		bo = a++ > 0 || 1 < ++b * d-- / ++c;
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d);
		
		bo = b++ > 0 && 1 < ++a / ++c * d++;
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d);
		
	}

}
