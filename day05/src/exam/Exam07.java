package exam;
/* 반복문 for
 * 특정 코드를 정해진 횟수만큼 출력할때 사용

 * for(초기식; 조건식; 증감식){
 *  반목할 문장;
 * }
 * 
 * for문의 식은 비워둘 수 있음(세미콜론은 필수!)
 * 무한반복 또는 의도하지 않은 형태의 반복 주의! 
 * 
 */
public class Exam07 {

	public static void main(String[] args) {
		//무한 반복
//		for( ; ; ) {
//			System.out.println("?");			
//		}
		
		int n = 0;
		for( ; n < 5; n++) {
			System.out.println(n);
		}

	}

}
