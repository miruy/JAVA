package exam;
/* switch ~ case 구문
 * (바꾸다)  (경우,사례)
 * 시작점을 고른다. 해당위치 "부터" 실행한다.(앞에 건너뛰고)
 * 
 * switch(정수){
 * case 상수1:
 * 		문장;[break]
 * case 상수2:
 * 		문장;
 * default;
 * 		문장;
 * }
 */

public class Exam03 {

	public static void main(String[] args) {
		
		char n = 'D';
		
		switch(n){
		case 'A' : 
			System.out.println("1");
			break;
		case 67 : 
			System.out.println("2");
			break;
		case 68 : 
			System.out.println("3");
			break;
		case 69 : 
			System.out.println("4");
			break;
		default : 
			System.out.println("매치되는 case가 없음");
		}
		
		
		
		
		
		

	}

}
