package exam;

import java.util.Scanner;

public class Test09 {

	public static double bTb(long a, char b) {
		
		double sum = 0;
		long byteToBit = 8;
		long plus = 1024; // k, m, g 순서대로  1024씩 커짐
		long kilobyte = a * byteToBit * plus;
		long Megabyte = kilobyte * plus;
		long Gigabyte = Megabyte * plus;
		
		if(b == 'K') {
			sum = kilobyte;
		}else if(b == 'M') {
			sum = Megabyte;
		}else if(b == 'G') {
			sum = Gigabyte;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// 파일의 용량(byte)를 매개변수로 입력받아 bit단위로 반환하는 함수
		// 파일의 용량을 입력할때 단위도 입력한다.(G,M.K)
		// 8 bit = 1 byte = 0.000976563 KB = 9.53674e-7 MB = 650 GB

		Scanner sc = new Scanner(System.in);

		System.out.print("용량 입력:");
		long amount = sc.nextLong();

		System.out.print("단위 입력:");
		char unit = sc.next().charAt(0); // char 형으로 입력 받을 경우 next()위에 참조연산자(.)과 배열의 순위를 나타내는 charAt(0)을 써줘야함

		double file = bTb(amount,unit);
		System.out.print(amount);
		System.out.print(unit);
		System.out.println(" > " + file + "bit");
		
	}

}
