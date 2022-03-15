package exam;

public class MyArray {
	private int[]arr;
	int length;

	public MyArray() {   //디폴트 생성자 
		arr = new int[5];
	}
	
	public MyArray(int length) {	//생성자 오버로딩 
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
	

}
