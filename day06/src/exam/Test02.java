package exam;

public class Test02 {

	public static void main(String[] args) {
		// 1 ���� 100������ Ȧ���� �հ� ¦���� ���� ���Ͻÿ� 
		
		int hsum = 0;
		int zsum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 ==0){
				hsum += i;
			}else {
				zsum += i;
			}
		}
		System.out.println("Ȧ�� �� : " + hsum);
		System.out.println("¦�� �� : " + zsum);

	}

}
