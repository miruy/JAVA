package exam;

import java.util.Random;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//45�� �迭 ����(�� 1~45, ���� 46)
				//Random()�� �̿��Ͽ� ���� �� 2�� ���ϱ�
				//�ΰ��� ���� ���� �ε����� �̿��Ͽ� 45�� �迭�� ���� �ٲ�
				//���� �� �ٲٱ� �۾��� n��(�Է¹޾�) �ݺ��Ͽ� 45�� �迭���� 6���� �� ����
				Random ran = new Random(); 
				Scanner sc = new Scanner(System.in);
				
				int[] shuffle = new int [45];
				int[] save = new int [6];
				
				for(int i = 0; i < shuffle.length; i++) {
					shuffle[i] = i + 1;
				}
					
				int su1;
				int su2;
				int n;
				
					System.out.print("���� �� : ");
					n = sc.nextInt();
					for(int i = 0; i < n; i++) {
						su1 = ran.nextInt(45);
						su2 = ran.nextInt(45);
						int imsi;
						
						if(su1 != su2) {
							imsi = shuffle[su1];
							shuffle[su1] = shuffle[su2];
							shuffle[su2] = imsi;
						}else {
							i--;
							continue;
							
						}
					 }
					for(int i = 0; i < save.length; i++) {
						int su = ran.nextInt(45);
						System.out.println(shuffle[su]);
					}
	
	}

}
