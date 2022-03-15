package Exam;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 중복 값을 입력하면 중복!을 추력하고 값을 저장하지 않게 해라
		Scanner sc = new Scanner(System.in);

		int[] arr;   //길이 없는 참조변수만 선언

		int[] add = {0,0,0};  //000으로 초기화 한 길이 3개짜리 배열
		for(int j=3; ;j+=3) { //3 6 9 12 ... 길이 3부터 시작해서 무한으로 반복실행 
			arr = new int[j];  //길이 값이 없던 arr 참조변수에 무한루프j를 길이로 선언 = arr은 무한루프길이
			for(int d = 0; d<arr.length; d++) { //d도 무한로프 돌예정
				arr[d] = add[d];  // 무한루프 돌며 들어오는 수를 arr과 add배열로 저장 
			}
		
			for(int i =j-3; i<arr.length; i++) {//0 3 6 9 ~ 배열길이만큼
				System.out.print("입력 (현재길이:"+j+") : ");
				arr[i] = sc.nextInt();
				for(int l = 0; l<add.length; l++) {
					if(arr[i] == add[l] ) {
						System.out.println("중복!");	
						i--;
						break;
					}
				}					
				for(int k = 0; k<=i; k++) { //0~배열길이만큼
					System.out.print(arr[k]+", ");
				}
				System.out.println();
				
			}
			
			
			System.out.println("증가됨("+(j+3)+")");
			add = new int[j+3];
			for(int d = 0; d<arr.length; d++) {
				add[d] = arr[d];
			}
	
		}

		
		
		
		
		
		
		
	}

}
