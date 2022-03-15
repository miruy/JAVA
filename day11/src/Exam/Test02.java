package Exam;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		int size = 3;
		String[] array = new String[size];	// 사용껏
		String[] array2 = new String[size];	// 백업용

		Scanner sc = new Scanner(System.in);
//컨트롤 쉬프트 B & 부분 라인 숫자 마우스 대고 왼쪽 떠블클릭
		while (true) {
			for (int i = 0; i < size; i++) {
				System.out.printf("입력 (현재 길이 %d): ", size);
				array[i] = sc.nextLine();
				if (i == size - 1) {
					for (int j = 0; j < size; j++) {
						array2[j] = array[j];
					}

					size += 3;

					array = new String[size];

					for (int j = 0; j < size - 3; j++) {
						array[j] = array2[j];
					}

					array2 = new String[size];
				}
				for (int j = 0; j <= i; j++) {
//					System.out.println(array[j] + ",");
					System.out.printf("%s,  ",array[j]);
				}
				System.out.println();
			}
		}

	}
}
