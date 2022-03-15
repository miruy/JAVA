package exam02;

public class MyArrayUtil {
	int[]arr;
	int length;
	int sum;	//합 
	
	public MyArrayUtil() {		//디폴트 생성자 
		arr = new int[5];
	}
	
	public MyArrayUtil(int length) {		//생성자 오버로딩 
		this.length = length;
	}
	
	public void setArr(int[]arr) {	//배열참조를 전달받아 세팅하는 메서드 
		this.arr = arr;
	}
	
	public int[] getArr() {	//기존 배열 참조를 반환하는 메서드 
		return arr;
	}
	
	
	public void setIndexAndArg(int index, int arg) {	//위치와 값을 전달받아 세팅하는 메서드
		arr[index] = arg;
	}
	
	public int getIndexAndArg(int index){//위치를 받아 해당 위치 값을 반환하는 메서드 
		return arr[index];
	}
	
	
	public int getLength(int length) {	//참조하는 배열의 길이를 반환하는 메서드 
		this.length = length;
		return length;
	}
	
	public int totalSum(int[]arr) {		//배열의 모든 값의합을 반환하는 메서드 
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public int indexConfirm(int arg){	
		int index = 0;//배열의 특정 값이 존재하는지 확인하여 해당 위치를 반환하는 메서드
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == arg) {
				index = i;
			}
		}
		return index;
	}
}
