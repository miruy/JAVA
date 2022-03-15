package exam;

public class Test02 {

	public static void main(String[] args) {
		// 12.
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int j = 1; j <= 4; j++) {
			for (int i = 4; i >= j; i--) {
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println();
		
		// 13.
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
			System.out.print("*");	
			}
			System.out.println();
		}
		
		for (int j = 1; j <= 4; j++) {
			for (int i = 0; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 14. 
		
		
		
		
		
	}

}
