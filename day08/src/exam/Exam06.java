package exam;
/*
 * 배열
 *  동일한 자료형으로 메모리에 연속으로 할당된 변수 
 * 
 */
public class Exam06 {

	public static void main(String[] args) {
		//전국민의 나이 조사
		int[] age = new int[50000000]; 
		//오천만개의 빈 공간을 만듬  age에는 배열 공간을 가리키는 주소값이 저장되어 있으므로 출력하면 주소값이 나옴
	
		for(int i = 0; i < age.length; i++) {
			age[i] = 30;
		}

		int totalAge = 0;
		for(int i = 0; i < age.length; i++) {
			totalAge += age[i];
		}
		//전국민의 평균 나이
		System.out.println(totalAge / age.length);
		
	}
}
