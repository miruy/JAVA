package exam;
/*제어문 if
 * 조건에 따라 코드에 실행 흐름을 분기하는 구문
 * 
 * if(조건식){
 * 조건이 만족될때 실행할 문장을 작성;
 * }
 * else{
 * if의 조건이 만족하지 않을때 실행할 문장 장성;
 * }
 * 
 * 
 * 
 */
public class Exam02 {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		int n= 9;
		
		if(n%2 == 0) {
			System.out.print(n + "은 짝수다.");
		}else {
			System.out.println(n + "은 홀수다.");
		}
		
		System.out.println("프로그램 종료");
		
		
	
	}
}
