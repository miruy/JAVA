package exam;

public class Test04 {

	public static void main(String[] args) {
		// 1 ���� 100������ �� �� 3�� ����� �����ϰ� 
		// 3�� ����̸鼭 5�� ����� ���� ���Ͽ� ����ϼ��� 
		
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			if(i % 3 != 0 || i % 5 == 0 && i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		

	}

}
