package exam;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		//윤년의 조건
		//4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다.
		//4로 나누어 떨어지지만 100으로도 나누어 떨어지는 해는 평년으로 한다.
		//단, 400으로 나누어 떨어지는 해는 윤년으로 한다.(예 : 2000년, 2400년)
		
		//입력 : 2004
		//출력 : 윤년
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
	
		if(year % 4 == 0) {
			if(year % 400 == 0){
				System.out.println("윤년");
			}else if(year % 100 == 0) {
				System.out.println("평년");
		}else{
				System.out.println("윤년");
			}	
		}
		

	}

}
