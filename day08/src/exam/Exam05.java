package exam;


/*
 * break
 *	 ������ ����
 * 	switch~case, for, while
 * 
 * continue
 *  ���� ������ �����ϰ� �������� ��� ����
 *  for, while
 * 
 * 
 */
public class Exam05 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				break; //break ���� �ƿ� ����
			}
			System.out.println(i);
		}
		
		
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				continue;  //continue������(i == 3) �ǳ� �ٰ� ��� ������ 
			}
			System.out.println(i);
		}
		
		
	}
}
