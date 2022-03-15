package exam;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
		// 6개 번호를 저장하는 배열 생성(값 x, 길이 6)
		// 45개 번호를 저장하는 배열 생성(값 0, 길이 45)
		// Random()이용하여 랜덤값 받기
		// 랜덤으로 받은 값을 45개 배열의 해당 값과 비교하여 해당 숫자가 처음나오는 수면
		// 45개 배열의 해당 칸 값을 0, 나왓던 수면 1로 변경
		// 랜덤으로 받은 값을 6개 배열에 저장
		Random ran = new Random();

		int[] save = new int[6];
		int[] flag = new int[45];
		int su;

		for (int i = 0; i < flag.length; i++) {
			flag[i] = 0;
		}
		
		for (int i = 0; i < save.length; i++) {
			su = ran.nextInt(45); //0~44
			if (0 == flag[su]) {
				flag[su] = 1;
				save[i] = su + 1;  //su가 0을 골랐음으로 +1해줌  
			}else if(1 == flag[su]){
				flag[su] = 0;
				save[i] = su;
				i--;
			}
			System.out.println(i+1 + "번째  수 : " + save[i]);
		}
		
		
		

	}

}
