package exam;

public class Test09 {

	public static void main(String[] args) {
		//������ ��� 2��~9��
		
		for(int i = 1; i <= 9; i++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d X %d = %d\t", dan, i, dan*i);
			}
			System.out.println();
		}

	}

}
