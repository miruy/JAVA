package exam;
/*
 * �ݺ��� : while
 * ������ ���� ���� �ݺ����� 
 * while(���ǽ�) {
	���๮��;
	}
 * 
 * 
 */
public class Exam01 {

	public static void main(String[] args) {
		
		int i = 0;
		for(; i < 5;) {
			System.out.print("*");
			i++;
		}
		
		//for���� �ʱ�İ� �������� ��ġ�� �޶��� �� �ܿ� for���� �Ȱ��� 
		
		i = 0;
		while(i < 5) {
			System.out.print("*");
			i++;
		}
	}

}
