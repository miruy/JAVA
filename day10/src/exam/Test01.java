package exam;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//주민등록번호 검증하기
		Scanner sc = new Scanner(System.in);
		
		int[]id = new int[12];
		int[]su = {2,3,4,5,6,7,8,9,2,3,4,5};
		int hap = 0;
		int gob;
		int veri = 0;
		
		for(int i = 0; i < id.length; i++) {
			System.out.println("마지막 자리 수 빼고 12자리를 입력하세요.");
			System.out.print(i + 1 + "번째 주민등록번호 입력 : ");
			id[i] = sc.nextInt();
			gob= id[i]*su[i];
			
			hap += gob;
			veri = 11-(hap % 11);
			if(veri == 11) {
				veri = 1;
			}else if(veri == 10) {
				veri = 0;
			}
		}
		System.out.println("검증번호 : " + veri);
		
		
		
		
		
		
		
		
		
		
	}

}
