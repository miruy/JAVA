package exam;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		//1~45 까지의 난수 생성 기능을 활용하여
		//로또 예상 번호를 출력하는 프로그램 만들기 (배열 이용)
		//6개의 숫자 
		Random ran = new Random(); 
		
		int[]lotto = new int[6];   //길이가 6인 배열 객체(빈공간)생성
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = ran.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--; 
					//i와 j가 같다는 건 중복이라는 의미이므로
					//중복되서 멈춘 순서로 다시 돌아가 그때부터 뽑기를 계속 진행하겠다는 의미
					break;
				}
			}
				System.out.println(lotto[i]);
		
			}
			
			
			
		
		
		
		
	}

}
