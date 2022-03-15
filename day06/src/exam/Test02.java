package exam;

public class Test02 {

	public static void main(String[] args) {
		// 1 부터 100까지의 홀수의 합과 짝수의 합을 구하시오 
		
		int hsum = 0;
		int zsum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 ==0){
				hsum += i;
			}else {
				zsum += i;
			}
		}
		System.out.println("홀수 합 : " + hsum);
		System.out.println("짝수 합 : " + zsum);

	}

}
