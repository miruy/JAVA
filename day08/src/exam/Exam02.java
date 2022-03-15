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
public class Exam02 {

	public static void main(String[] args) {
		
		int n = 1;
		
		while(true) { //무한 반복
			if(n % 7 == 0) {
				break;
			}
			System.out.println(n);
			n++;
		}
	}

}
