package Exam;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 정수를 저장하는 배열을 무한대로 늘어나도록 작성
		Scanner sc = new Scanner(System.in);

		int size = 3;
		int[] array = new int[size];
		int[] array2 = new int[size];

		while (true) {    //무한 입력
			for (int i = 0; i < size; i++) {   //초기 길이 3만큼 반복

				System.out.printf("입력 (현재 길이 : %d): ", size);
				array[i] = sc.nextInt();     //array[i]로 받음

				if (i == size - 1) {   //입력을 2번까지 받았다면 
					for (int j = 0; j < size; j++) {   //array[j] = array[i] (i,j는 숫자로봤을때 같은 인덱스)
						array2[j] = array[j];       //array인덱스를 array2인덱스로 옮기겠다(복사)
					}
					size += 3;    //size 길이 늘림 (무한입력의 길이 )
					array = new int[size];    //array[] 길이는 6이된 size로 변경 과 동시에 새로 배열 선언

					for (int j = 0; j < size - 3; j++) {
						array[j] = array2[j];           //위와 같은 방식으로 반복
					}

					array2 = new int[size];

				}
				for (int j = 0; j <= i; j++) {     
					System.out.print(array[j] + ",");
				}
				System.out.println();
			}
		}

	}

}
