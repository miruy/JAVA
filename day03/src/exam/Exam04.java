package exam;

import java.util.Scanner;  //다른 패키지의 클래스를 사용한다고 선언한 것 

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수 입력
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();  
		System.out.println("입력한 값 : " + n);
		//실수 입력
		System.out.print("실수 입력 : ");
		double f = sc.nextDouble();
		System.out.println("입력한 값 : " + f);
		
		//수치형 입력 후 문자열 입력이 필요한 경우 개행문자를 제거해준다! 
		sc.nextLine();  //한번 더 nextLine을 헤줌으로써 엔터를 제거해줌 
		
		//문자 입력
		
		//문자열
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine(); //엔터(개행)까지 읽어 한 덩어리로 만든 후 변수가 그 덩어리를 참조하는 시스템 
		System.out.println("입력한 값 : " + str);
		
		char ch = str.charAt(0); 
		System.out.println(ch); //문자열의 인덱스 
		System.out.println(str.charAt(1)); //문자열의 인덱스 
		
		//단일문자
		System.out.print("문자 하나 입력 : ");
		char cha = sc.nextLine().charAt(0);
		System.out.println("입력한 값 : " + cha);
	}
}
