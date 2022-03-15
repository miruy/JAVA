package exam;


/*
 * break
 *	 진행을 종료
 * 	switch~case, for, while
 * 
 * continue
 *  현재 진행을 종료하고 다음으로 계속 진행
 *  for, while
 * 
 * 
 */
public class Exam05 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				break; //break 이후 아예 끝냄
			}
			System.out.println(i);
		}
		
		
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				continue;  //continue시점만(i == 3) 건너 뛰고 계속 실행함 
			}
			System.out.println(i);
		}
		
		
	}
}
