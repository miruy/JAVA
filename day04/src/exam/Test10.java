package exam;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		//디스켓 1통에 500원한다.
		//그런데 한번에 10통 이상을 사면 전체 금액의 10%를 할인해준다.
		//그리고 100통 이상을 사면 전체 금액의 12%를 할인해준다.
		//X통의 디스켓을 사려면 얼마가 있어야 하는가?
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("구매할 디스켓 갯수 : ");
		int discat = sc.nextInt();
		
		int money =  discat*500;
		
		if(discat >= 100) {
			System.out.println("할인된 금액 : " + money / 12);
			System.out.println("구매하기 위해 필요한 금액 : " + (money -(money / 12)));
		}else if(discat >= 10) {
			System.out.println("할인된 금액 : " + money / 10);
			System.out.println("구매하기 위해 필요한 금액 : " + (money -(money / 10)));
		}else {
			System.out.println("구매하기 위해 필요한 금액 : " + money);
		}
		
		
		
	}

}
