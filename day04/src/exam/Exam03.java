package exam;
/*제어문 if
 * 조건에 따라 코드에 실행 흐름을 분기하는 구문
 * 
 * if(조건식){
 * 조건이 만족될때 실행할 문장을 작성;
 * 
 * }else if{
 * if의 조건이 만족하지 않을때 
 * 이어지는 조건을 확인하고 실행할 문장 작성;
 * 
 * }else if(조건식){
 * 		......
 * 
 * }else{
 * 		....모든 조건이 안맞을때 실행할 문장(선택)
 * }
 * 
 */
public class Exam03 {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		int n = 88;
		
		if(n == 100) {
			System.out.println(n + "최대값이다.");
		}else if(n == 0){
			System.out.println(n + "최소값이다.");
		}else {
			System.out.println(n + "중간값이다.");
		}
		
		System.out.println("프로그램 종료");
		
		
	
	}
}
