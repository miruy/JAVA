package exam;
/*
 * 반복문 : while
 * 조건이 참인 동안 반복수행 
 * while(조건식) {
	실행문장;
	}
 * 
 * 
 */
public class Exam01 {

	public static void main(String[] args) {
		
		int i = 0;
		for(; i < 5;) {
			System.out.print("*");
			i++;
		}
		
		//for문의 초기식과 증감식의 위치가 달라진 것 외에 for문과 똑같음 
		
		i = 0;
		while(i < 5) {
			System.out.print("*");
			i++;
		}
	}

}
