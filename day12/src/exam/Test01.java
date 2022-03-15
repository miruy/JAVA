package exam;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 다차원 배열은 각 배열의 길이를 다르게 할당할 수 있다.
		// 입력받은 수 만큼 가변 배열 할당
		// 할당된 가변배열에 각각 길이를 다르게 입력 받아 배열 할당
		// 값은 0부터 자동입력 후 출력

		int arrCount1;              //처음 생성할 배열의 길이를 입력받을 변수 선언

		Scanner sc = new Scanner(System.in);

		System.out.print("몇 행의 배열을 만드시겠습니까?");
		arrCount1 = sc.nextInt();
		System.out.println("각 행의 배열을 만드세요!");

		int[][] arr = new int[arrCount1][];           //arr이라는 참조변수를 가진 배열이며 길이는 arrCount1(입력값)이고 뒤 배열길이는 아직 없음
		int arrCount2;	                              //입력받은 첫 배열안에 만들 두번째 배열의 길이를 입력받기 위한 변수 선언

		for (int i = 0; i < arr.length; i++) {        //arr의 길이 = arrCount1(입력값)만큼 반복함 
			System.out.print(i + 1 + "번째 행의 배열 : ");  
			arrCount2 = sc.nextInt();				
			arr[i] = new int[arrCount2];              //arr의 i번째(반복문에 의해 0.1.2...올라감)인덱스에 arrCount2의 길이를 가진 배열이 새로 생성됨 
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {  //이 문장에서 말하는 arr[i]의 길이는 반복하며 새로 생성된 arrCount2길이 

				System.out.print(j + " ");  //arr[i]의 길이를 0,1.2,3...로 출력하기위해 j를 출력문에 씀
			}
			System.out.println();
		}

	}
}
