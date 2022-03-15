package exam;

import java.util.Scanner;

/*
 * 자바에서 배열은 동적(runtime)으로 생성됨
 * 실행중에 객체가 만들어짐 
 * 
 */
public class Exam08 {

	public static void main(String[] args) {
		//컴파일 하는 시점에 배열의 개수를 정할 수 없다면?
		Scanner sc = new Scanner(System.in);
		
		int[]arr = null;
		System.out.print("길이 입력 : ");
		int n = sc.nextInt();
		
		arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
