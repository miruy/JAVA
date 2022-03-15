package exam;

import java.util.Scanner;

public class Test04 {

	public static int oddSum(int a) {
		int imsi = 0;
		int sum = 0;
		for(int i = 0; i <= a; i++) {
			if(i % 2 != 0) {
				imsi = i;
				sum += imsi;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//수를 입력받아 1부터 입력받은 수까지 홀수의 합을 반환하는 메서드 
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력");
		int a = sc.nextInt();
		
		System.out.println(oddSum(a));
	}
}
