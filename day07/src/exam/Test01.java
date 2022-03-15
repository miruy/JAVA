package exam;

public class Test01 {

	public static void main(String[] args) {
		// 6.
		for (int j = 0; j < 5; j++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print(i + j);
			}
			System.out.println();
		}
		System.out.println();

		// 7.
		for (int j = 0; j < 5; j++) {
			for (int i = 5; i < 10; i++) {
				System.out.print(i - j);
			}
			System.out.println();
		}

		System.out.println();

		// 8.
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println();

		// 9.
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		// 10.
		for (int j = 1; j <= 5; j++) {
			for(int k = 1; k <= j-1; k++) {
				System.out.print(" ");
			}
				for (int i = 5; i >= j; i--) {
					System.out.print("*");
			}System.out.println();
		}

		System.out.println();
		
		// 11.
		for (int j = 1; j <= 5; j++) {
			for(int k = 1; k <= 5-j; k++) {
				System.out.print(" ");
			}
				for (int i = 1; i <= j; i++) {
					System.out.print("*");
			}System.out.println();
		}
		
		
		
		
	}

}
