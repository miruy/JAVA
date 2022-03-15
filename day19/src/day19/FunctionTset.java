package day19;

public class FunctionTset {

	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int miner(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int gob(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	public static int nanugi(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
	
	public static int nanugi2(int n1, int n2) {
		int result= n1 % n2;
		return result;
	}
	
	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 20;

		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		System.out.println(miner(num1, num2));
		System.out.println(gob(num1, num2));
		System.out.println(nanugi(num1,num2));
		System.out.println(nanugi2(num1, num2));
	}
}
