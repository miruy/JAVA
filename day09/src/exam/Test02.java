package exam;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		//1~45 ������ ���� ���� ����� Ȱ���Ͽ�
		//�ζ� ���� ��ȣ�� ����ϴ� ���α׷� ����� (�迭 �̿�)
		//6���� ���� 
		Random ran = new Random(); 
		
		int[]lotto = new int[6];   //���̰� 6�� �迭 ��ü(�����)����
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = ran.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--; 
					//i�� j�� ���ٴ� �� �ߺ��̶�� �ǹ��̹Ƿ�
					//�ߺ��Ǽ� ���� ������ �ٽ� ���ư� �׶����� �̱⸦ ��� �����ϰڴٴ� �ǹ�
					break;
				}
			}
				System.out.println(lotto[i]);
		
			}
			
			
			
		
		
		
		
	}

}
