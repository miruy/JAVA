package exam;

/* ������ �迭
 * �ڷ���[][] �������� = new �ڷ���[][];
 */


public class Exam01 {
	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];  //4��¥�� �迭�� ����Ű�� 3��¥�� �迭�� arr�� ������ 
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
