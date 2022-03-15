package exam;

import java.util.Random;

public class Exam09 {

	public static void main(String[] args) {
		Random ran = new Random();  //무자위의 숫자(난수)를 처리할 수 있음
		
		for(int i = 0; i < 5; i++) {
 			int n = ran.nextInt(100);  //0~99
			System.out.println(n);
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			int n = ran.nextInt(100) + 1;  //1~100
			System.out.println(n);
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			int n = ran.nextInt(45) + 1; //1~45
			System.out.println(n);
		}
		//1~45 까지의 난수 생성 기능을 활용하여
		//로또 예상 번호를 출력하는 프로그램 만들기 (배열없이 만들기)
		//6개의 숫자 
		
	}
}
