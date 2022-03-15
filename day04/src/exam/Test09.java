package exam;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		//배달 도시락을 주문하는데 10개까지는 개당 2500원이고
		//10개를 초과하는 양에 대해서는 개당 2400원이다.
		//배달 도시락의 개수를 입력 받아서 금액을 계산하는 프로그램을 작성하라
		
		Scanner sc = new Scanner(System.in); 
		
		int baseRate = 2500;
		int addRate = 2400;
		
		System.out.print("구매할 도시락 갯수 : ");
		int dosirac = sc.nextInt();
		
		if(dosirac <= 10) {
			System.out.println("금액 : " + dosirac * baseRate);
		}else {
			System.out.println("금액 : " + dosirac * addRate);
		}
	}

}
