package exam;
/*
 * 매개변수(parameter)
 * 메서드 호출 시 전달된 데이터를 저장하는 변수(지역변수)
 * 인자(argument)
 * 메서드 호출 시 전달된 데이터 
 * 
 * 매개변수가 primitive(기본자료형)한 자료형이면 값을 복사 
 * 매개변수가 class 형 자료형이면 참조를 복사 
 * 
 * 반환자료형
 * 	메서드 동작 결과 값을 지정
 * void : 반환값이 없음
 * int, String....배열도 됨/ 반환하는 값의 따라 다름
 * 리턴 값과 매개변수는 상관 없다.
 * 
 * 메서드 오버로딩 - 다형성
 * 동일한 이름의 메서드가 있을때
 * 매개변수의 종류, 갯수, 순서에 따라서 구분가능
 */


public class Exam02 {
	
	public static void method1() {
		System.out.println("매개변수가 없는 메서드");
	}

	public static void method2(int a) {
		System.out.println("매개변수로 primitive한 자료형을 받음");
		System.out.println(a);
		a = 100;  //a값이 n으로 변경됨 
	}
	
	public static void method3(int[] arr) {
		System.out.println("매개변수로 배열(클래스) 자료형을 받음");
		System.out.println(arr[0]);
		arr[0] = 100;
	}
	
	
	public static void main(String[] args) {
		 method1() ;
		 method1() ;
		 int n = 10;
		 method2(n);
		 
		 int[]arr = {1,2,3};
		 for(int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]);
		 }
		 method3(arr);
		 for(int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]);
		 }
		 System.out.println();
		 
	
		 
	}

}
