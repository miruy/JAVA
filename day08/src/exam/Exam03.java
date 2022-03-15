package exam;
/*
 * 반복문 : do ~ while
 * while 문의 종속 문장이 앞에 있어서 우선 실행 후 계속할지말지를 조건보고 결정함 
 * 종속문장을 최소 한번 실행함 
 * 
 * 
 */
public class Exam03 {

	public static void main(String[] args) {
		
		int n = 10;
		while(n < 5) {
			System.out.println("1");
		}
		
		do {
			System.out.println("2");
		}while(n < 5);
	}

}
