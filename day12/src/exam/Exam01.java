package exam;

/* 다차원 배열
 * 자료형[][] 참조변수 = new 자료형[][];
 */


public class Exam01 {
	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];  //4개짜리 배열을 가리키는 3개짜리 배열을 arr이 참조함 
		int count = 1;   
		for(int i = 0; i < arr.length; i++) {  //arr.length = 3
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
