package exam02;

public class MyArrayUtilMain {

	public static void main(String[] args) {
		MyArrayUtil array1 = new MyArrayUtil();
		array1.setIndexAndArg(0,5);
		array1.setIndexAndArg(1,4);
		array1.getIndexAndArg(1);
		
		int[]arr = {1,2,3,4,5};
		array1.setArr(arr);
		array1.getLength(array1.length);
		
		
		System.out.println(array1.totalSum(arr));
		
		System.out.println(array1.indexConfirm(2));

	}

}