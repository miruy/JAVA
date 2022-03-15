package exam;

import java.util.Scanner;

public class Test08 {
	
	public static float inch(float a) {  
		float oneInch = 2.54f;
		float inch = a * oneInch;
		return inch;
	}

	public static void main(String[] args) {
		// cm값을 inch값으로 반환하는 함수 (1inch == 2.54cm)
		Scanner sc = new Scanner(System.in);
		System.out.println("cm 입력 : ");
		float cm = sc.nextFloat();

		System.out.println(inch(cm));
	}

}
