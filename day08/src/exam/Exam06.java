package exam;
/*
 * �迭
 *  ������ �ڷ������� �޸𸮿� �������� �Ҵ�� ���� 
 * 
 */
public class Exam06 {

	public static void main(String[] args) {
		//�������� ���� ����
		int[] age = new int[50000000]; 
		//��õ������ �� ������ ����  age���� �迭 ������ ����Ű�� �ּҰ��� ����Ǿ� �����Ƿ� ����ϸ� �ּҰ��� ����
	
		for(int i = 0; i < age.length; i++) {
			age[i] = 30;
		}

		int totalAge = 0;
		for(int i = 0; i < age.length; i++) {
			totalAge += age[i];
		}
		//�������� ��� ����
		System.out.println(totalAge / age.length);
		
	}
}
