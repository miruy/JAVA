package exam;

public class Test12 {

	public static void main(String[] args) {
		// 1���� �����Ͽ� Ȧ���� ���� ���ϸ鼭 ������ 10000�� ���� �ʴ� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͽ���
		int su = 1;
		int hap = 0;
		
		for(int i = 1; hap < 10000; i+=2) {
			hap += i;
			su = i;
		}
			
			System.out.println("�� �� : " + hap);
			System.out.print("������ �� : " + su);
		
		
	}

}
