package exam;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// 생성할 배열의 길이를 입력받고
		// 길이 만큼 값을 입력받고
		// 해당 배열 생성하기

		int[] array = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 배열의 길이 입력 : ");
		int arrayLength = sc.nextInt();
		System.out.println(arrayLength + "개의 배열이 생성되었습니다. ");

		array = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			System.out.print(i + 1 + "번째 값을 입력하세요 : ");
			array[i] = sc.nextInt();
		}

		System.out.print("배열에 입력된 값은 ");
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println("입니다.");

		int imsi1;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					imsi1 = array[i];
					array[i] = array[j];
					array[j] = imsi1;
				}
			}
		}
		System.out.print("정렬 후 값은 ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.print("입니다.");
	}

}
