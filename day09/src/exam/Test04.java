package exam;

import java.util.Random;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//45개 배열 생성(값 1~45, 길이 46)
				//Random()를 이용하여 랜덤 값 2개 구하기
				//두개의 랜덤 값을 인덱스를 이용하여 45개 배열에 값을 바꿈
				//랜덤 값 바꾸기 작업을 n번(입력받아) 반복하여 45개 배열에서 6개의 값 저장
				Random ran = new Random(); 
				Scanner sc = new Scanner(System.in);
				
				int[] shuffle = new int [45];
				int[] save = new int [6];
				
				for(int i = 0; i < shuffle.length; i++) {
					shuffle[i] = i + 1;
				}
					
				int su1;
				int su2;
				int n;
				
					System.out.print("셔플 수 : ");
					n = sc.nextInt();
					for(int i = 0; i < n; i++) {
						su1 = ran.nextInt(45);
						su2 = ran.nextInt(45);
						int imsi;
						
						if(su1 != su2) {
							imsi = shuffle[su1];
							shuffle[su1] = shuffle[su2];
							shuffle[su2] = imsi;
						}else {
							i--;
							continue;
							
						}
					 }
					for(int i = 0; i < save.length; i++) {
						int su = ran.nextInt(45);
						System.out.println(shuffle[su]);
					}
	
	}

}
