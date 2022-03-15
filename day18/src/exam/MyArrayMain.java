package exam;

public class MyArrayMain {

	public static void main(String[] args) {
		MyArray array1 = new MyArray();		//디폴트 생성자 
		int[]arr = {2,6,5,8,9,1}; 	
		array1.setArr(arr);			//array1이 arr배열을 참조함  
		System.out.println(array1.getArr());	
		
		MyArray array2 = new MyArray(4);	//오버로딩 생성자(길이 입력) 
		System.out.println(array2.length);	
		
		MyArray array3 = new MyArray();
		array3.setIndexAndArg(0, 1);		//인덱스번호(위치)와 값 전달  
		array3.setIndexAndArg(1, 2);
		array3.setIndexAndArg(2, 3);
		System.out.println(array3.getIndexAndArg(0));
		System.out.println(array3.getIndexAndArg(1));
		System.out.println(array3.getIndexAndArg(2));
		
		MyArray array4 = new MyArray();
		array4.getLength(8);		//길이 반환 메서드 
		System.out.println(array4.length);
	}

}
