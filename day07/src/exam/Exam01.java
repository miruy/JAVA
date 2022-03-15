package exam;

public class Exam01 {

	public static void main(String[] args) {
		// 별 만들기

		// 1.
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		System.out.println();

		// 2.
		for (int i = 0; i < 5; i++) {
			System.out.println("*");
		}
		System.out.println();

		// 3.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 4.
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(i);
			}
			System.out.println();
		
		}

		// 5.
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(j+1);
			}
			System.out.println();
		}

	}

}
