package exam;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//두 수를 입력받아 큰 수를 출력하시오 
		
		System.out.print("첫번째 수를 입력하세요 : ");
		int su1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요 : ");
		int su2 = sc.nextInt();
		
			//int ret;
		if(su1 > su2) {
			//ret = n1;
			System.out.println("두 수 중 큰 수 : " + su1);
		}else {
			//ret = n2;
			System.out.println("두 수 중 큰 수 : " + su2);
			//System.out.println(ret);
		}
		
		
	}

}
