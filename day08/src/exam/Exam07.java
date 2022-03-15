package exam;
/*
 * 배열 선언 방법
 * 자료형[]참조변수명 = null;  //배열 참조변수만 선언 이때 배열은 없음 
 *    참조변수명 = new 자료형[갯수];
 * 또는  참조변수명 = new 자료형[]{값1, 값2, 값3....}
 * 
 * 선언과 동시에 초기화 : 자료형[]참조변수명 = {값1, 값2, 값3....} // 선언과 동시에만 가능함
 */
public class Exam07 {

	public static void main(String[] args) {
		int[] arr1 = {5,6,7}; //선언과 동시에 초기화 new생략가능
//		int[] arr1 = new int[3];
//		int[] arr1 = new int[] {10,20,30};
		
		int[] arr2 = null;  //배열 참조변수만 선언(배열객체X)
		int[] arr3 = null;  
		
		arr2 = new int[4];
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		arr2[3] = 400;
		
		arr3 = new int[]{1000,2000};
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
}
