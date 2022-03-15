package exam;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int n =sc.nextInt();
		
		int result = 0;                     
		
		while(n != 0) {                     //n이 0이 아니라면 반복실행 
			int temp = n%10;				//n % 10 = 3을 temp변수에 저장 >> temp = 3
			
			result = (result*10) + temp;    //(계산식 순서대로)result*10 = 0, result = 0 + temp >> result = 3 
			
			n = n/10;                       //n / 10 = 12로 n을 초기화  >> n 값이 12인 상태로 다시 반복(n이 0이 될때까지) 
		}
		
		System.out.println(result);         //반복실행을 통해 result에 저장되는 3,2,1를 출력  
		
		
		
	}

}
