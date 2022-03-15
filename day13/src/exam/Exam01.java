package exam;

/*
 * 메서드(함수)
 * 자주 사용되는 기능을 미리 정의해두고 필요할때 호출
 * 
 * 메서드 정의
 * 	반환자료형 메서드명 (매개변수){
 * 		동작할 기능
 * 	return 반환값;
 * }
 */

public class Exam01 {
	
	public static int add(int a, int b) {
		int sum = a+b;
		return sum;   //값이 메인메서드 위치에 돌아온다. 
	}

	public static void main(String[] args) {
		int n = add(2,4); //메서드 호출
		System.out.println(n);
	}

}
