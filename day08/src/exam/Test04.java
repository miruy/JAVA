package exam;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int n =sc.nextInt();
		
		int result = 0;                     
		
		while(n != 0) {                     //n�� 0�� �ƴ϶�� �ݺ����� 
			int temp = n%10;				//n % 10 = 3�� temp������ ���� >> temp = 3
			
			result = (result*10) + temp;    //(���� �������)result*10 = 0, result = 0 + temp >> result = 3 
			
			n = n/10;                       //n / 10 = 12�� n�� �ʱ�ȭ  >> n ���� 12�� ���·� �ٽ� �ݺ�(n�� 0�� �ɶ�����) 
		}
		
		System.out.println(result);         //�ݺ������� ���� result�� ����Ǵ� 3,2,1�� ���  
		
		
		
	}

}
