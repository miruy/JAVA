package exam;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		//유원지에서 말을 태워주는데 처음 30분의 기본요금은 1인당 3000원이다. 
		//이후 에는 10분당 500원씩의 추가요금을 받는다.
		//말을 탄 시간을 입력받아서 전체 금액을 계산하는 프로그램으로 작성하여라.

		Scanner sc = new Scanner(System.in);
		
		int baseTime = 30;
		int baseRate = 3000;
		int addTime = 10;
		int addTimeRate = 500;
		int addTotalRate; 
	
		
		System.out.print("말을 탄 시간 : ");
		int time = sc.nextInt();
		
		if(time <= 39) {
			System.out.println("요금 : " + baseRate);
		}else if (time % 10 == 0){
			addTotalRate = (time-30)/10*500+3000;
			System.out.println("요금 : " + addTotalRate);
		}	
		
	}

 }
