package exam;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//세 수를 입력받아 큰 순서대로 출력하시오
			
			System.out.print("첫번째 수를 입력하세요 : ");
			int su1 = sc.nextInt();
			
			System.out.print("두번째 수를 입력하세요 : ");
			int su2 = sc.nextInt();
			
			System.out.print("세번째 수를 입력하세요 : ");
			int su3 = sc.nextInt();
			
			if(su1 > su2 && su1 > su3) {
				if(su2 > su3) {
					System.out.println(su1 + ">" + su2 + ">" + su3);
				}else if(su2 < su3) {
					System.out.println(su1 + ">" + su3 + ">" + su2);
				}
			}else if(su2 > su1 && su2 > su3) {
				if(su1 > su3) {
					System.out.println(su2 + ">" + su1 + ">" + su3);
				}else if(su1 < su3) {
					System.out.println(su2 + ">" + su3 + ">" + su1);
				}
			}else if(su3 > su1 && su3 > su2) {
				if(su1 > su2) {
					System.out.println(su3 + ">" + su1 + ">" + su2);
				}else if(su1 < su2) {
					System.out.println(su3 + ">" + su2 + ">" + su1);
				}
			}
			
	
		
	}

}
