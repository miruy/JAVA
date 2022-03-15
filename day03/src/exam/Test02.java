package exam;

public class Test02 {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 10;
		int d = 0;
		
		boolean bo = false;
		
		d = ++a * b--;		
		System.out.printf("a = %d, b = %d, d = %d\n",a,b,d);

		d = a++ + ++c - b--;
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a,b,c,d);
		
		a = 1;
		b = 0;
		
		// || 와 && 이 포함된 연산의 경우 왼쪽부터 연산이 실행되는데
		//이때 논리연산자의 결과에 들어맞으면 오른쪽 연산 자체는 실행을 안하고 그대로 감
		//따라서 밑에 c,d의 결과는 위 에 값 그대로 출력됨 
		bo = a++ > 0 || 1 < ++b * d-- / ++c;
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d);
		
		bo = b++ > 0 && 1 < ++a / ++c * d++;
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d);
		
	}

}
