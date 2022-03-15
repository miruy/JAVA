package exam;

import java.util.Scanner;

/*
 * 반복문 : do ~ while
 * while 문의 종속 문장이 앞에 있어서 우선 실행 후 계속할지말지를 조건보고 결정함 
 * 종속문장을 최소 한번 실행함 
 * 
 * 
 */
public class Exam04 {

	public static void main(String[] args) {
		//범위 안의 숫자 입력
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		while(true) {
			System.out.print("수 입력()~100) : ");
			n = sc.nextInt();
			if(n >= 0 && n <= 100) {
				break;
			}
		}
		System.out.println(n);
		
		
		n = 0;
		do {
			System.out.print("수 입력()~100) : ");
			n = sc.nextInt();
		}while(!(n >= 0 && n <= 100));
		System.out.println(n);
		
		
		
	}
}
