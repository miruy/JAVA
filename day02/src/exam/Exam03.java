package exam;

/*
 * 변수, 상수, 자료형?
 * 값이 들어있는 메모리 공간!
 * 	변수는 공간에 들어있는 값을 변경할 수 있고
 * 	상수는 변경할 수 없음
 */

public class Exam03 {
	public static void main(String[] args) {
		//변수 선언(공간 확보)
		// 자료형 변수명; => 초기값: 쓰레기값
		// 자료형 변수명 = 값; 초기화(변수의 최초값을 세팅하는 것)
		// = 대입 연산자!: 오른쪽 식의 결과를 왼쪽에 복사(대입)
		boolean b = true;
		byte n1 = 10; //1byte
		short n2 = 20;  //2byte
		char n3 = 65;   //2byte
		int n4 = 432141233;  //4byte (정수 기본자료)
		long n = 42152313434213213L;  //8byte
		float n5 = 3.14f;  //4byte
		double n6 = 3.14;  //8byte(정밀함, 실수 기본자료) 
		
		System.out.println(b);
		System.out.println(n);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		n4 = 100; //값을 변경
		System.out.println(n4);
		
	}
}

