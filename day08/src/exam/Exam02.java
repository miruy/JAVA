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
public class Exam02 {

	public static void main(String[] args) {
		
		int n = 1;
		
		while(true) { //���� �ݺ�
			if(n % 7 == 0) {
				break;
			}
			System.out.println(n);
			n++;
		}
	}

}
