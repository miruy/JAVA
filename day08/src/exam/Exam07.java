package exam;
/*
 * �迭 ���� ���
 * �ڷ���[]���������� = null;  //�迭 ���������� ���� �̶� �迭�� ���� 
 *    ���������� = new �ڷ���[����];
 * �Ǵ�  ���������� = new �ڷ���[]{��1, ��2, ��3....}
 * 
 * ����� ���ÿ� �ʱ�ȭ : �ڷ���[]���������� = {��1, ��2, ��3....} // ����� ���ÿ��� ������
 */
public class Exam07 {

	public static void main(String[] args) {
		int[] arr1 = {5,6,7}; //����� ���ÿ� �ʱ�ȭ new��������
//		int[] arr1 = new int[3];
//		int[] arr1 = new int[] {10,20,30};
		
		int[] arr2 = null;  //�迭 ���������� ����(�迭��üX)
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
