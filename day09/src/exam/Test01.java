package exam;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		//1~45 ������ ���� ���� ����� Ȱ���Ͽ�
		//�ζ� ���� ��ȣ�� ����ϴ� ���α׷� ����� (�迭���� �����)
		//6���� ���� 
		Random ran = new Random(); 
		
		while(true) {
			int lotto1;
			int lotto2;
			int lotto3;
			int lotto4;
			int lotto5;
			int lotto6;
			
			lotto1 = ran.nextInt(45) + 1;    
			lotto2 = ran.nextInt(45) + 1;    
			lotto3 = ran.nextInt(45) + 1;   
			lotto4 = ran.nextInt(45) + 1;   
			lotto5 = ran.nextInt(45) + 1;   
			lotto6 = ran.nextInt(45) + 1; 
			
			if(lotto1 != lotto2 && lotto1 != lotto3 && lotto1 != lotto4 && lotto1 != lotto5 && lotto1 != lotto6&&
					lotto2 != lotto3 && lotto2 != lotto4 && lotto2 != lotto5 && lotto2 != lotto6&&
					lotto3 != lotto4 && lotto3 != lotto5 && lotto3 != lotto6&&
					lotto4 != lotto5 && lotto4 != lotto6&&
					lotto5 != lotto6) {
				System.out.printf("%2d %2d %2d %2d %2d %2d",
						lotto1,lotto2, lotto3, lotto4, lotto5, lotto6);	
				break;
			}
		}
		
		
		
	}

}
