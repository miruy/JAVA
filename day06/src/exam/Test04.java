package exam;

public class Test04 {

	public static void main(String[] args) {
		// 1 부터 100까지의 수 중 3의 배수는 제외하고 
		// 3의 배수이면서 5의 배수인 수를 더하여 출력하세요 
		
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			if(i % 3 != 0 || i % 5 == 0 && i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		

	}

}
