package exam;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
		// 6�� ��ȣ�� �����ϴ� �迭 ����(�� x, ���� 6)
		// 45�� ��ȣ�� �����ϴ� �迭 ����(�� 0, ���� 45)
		// Random()�̿��Ͽ� ������ �ޱ�
		// �������� ���� ���� 45�� �迭�� �ش� ���� ���Ͽ� �ش� ���ڰ� ó�������� ����
		// 45�� �迭�� �ش� ĭ ���� 0, ���Ӵ� ���� 1�� ����
		// �������� ���� ���� 6�� �迭�� ����
		Random ran = new Random();

		int[] save = new int[6];
		int[] flag = new int[45];
		int su;

		for (int i = 0; i < flag.length; i++) {
			flag[i] = 0;
		}
		
		for (int i = 0; i < save.length; i++) {
			su = ran.nextInt(45); //0~44
			if (0 == flag[su]) {
				flag[su] = 1;
				save[i] = su + 1;  //su�� 0�� ��������� +1����  
			}else if(1 == flag[su]){
				flag[su] = 0;
				save[i] = su;
				i--;
			}
			System.out.println(i+1 + "��°  �� : " + save[i]);
		}
		
		
		

	}

}
