package exam;

public class Test12 {

	public static void main(String[] args) {
		// 1부터 시작하여 홀수의 합을 구하면서 그합이 10000을 넘지 않는 마지막 수를 구하는 프로그램을 작성하여라
		int su = 1;
		int hap = 0;
		
		for(int i = 1; hap < 10000; i+=2) {
			hap += i;
			su = i;
		}
			
			System.out.println("총 합 : " + hap);
			System.out.print("마지막 수 : " + su);
		
		
	}

}
