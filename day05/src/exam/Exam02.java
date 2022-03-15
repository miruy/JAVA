package exam;

import java.util.Scanner;

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

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		switch(str){
		case "hello" : 
			System.out.println("1");
			break;
		case "안녕하세요" : 
			System.out.println("2");
			break;
		case "hi" : 
			System.out.println("3");
			break;
		default : 
			System.out.println("매치되는 case가 없음");
		}
		
		//switch 에서 String을 활용할 수 있는 이유
		//객체는 모두 해쉬코드를 갖는다.
		//String이 가지는 문자열을 이용하여 hashCode값이 만들어짐 
		System.out.println("hello".hashCode());
		System.out.println(str.hashCode());
		
		
		
		
		

	}

}
