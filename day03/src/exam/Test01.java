package exam;

import java.io.IOException;
import java.util.*;

public class Test01 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		//char ex = (char)System.in.read();
		//키보드로부터 입력된 한 문자(1byre)를 읽어들임
		//캐스팅 : 데이터 형태를 변환 해야할 때 자료형을 명시하는 것 (큰것에서 작은 것으로 갈때)
		
		//1. 자신의 이니셜 (String/char)을 입력받아 출력하시오
		
			System.out.print("영어이름을 입력하세요 : ");
			
			String engName = sc.nextLine();
			System.out.println("입력하신 영어이름 : " + engName);
			
			char ch = engName.charAt(0);
			System.out.print("이니셜 : " + ch);
			System.out.print(engName.charAt(3));
			System.out.println(engName.charAt(5));
			
			System.out.println();
		//2. 3과목의 성적을 입력받아 합계와 평균을 구하시오
			
			System.out.print("국어점수를 입력하세요 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어점수를 입력하세요 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학점수를 입력하세요 : ");
			int math = sc.nextInt();
			
			int total = kor + eng + math;
			
			int average = total / 3;
			
			System.out.println("3과목의 합 : " + total);
			System.out.println("3과목의 평균 : " + average);
			
			sc.nextLine();
		/*3. 다음과 같이 데이터를 입력받아 출력하시오
		 * 당신의 이름은 무엇입니까?  홍길동
		 * 홍길동님의 나이는 몇 살입니까? 18
		 * 홍길동님의 나이는 18살입니다.
		 */
			
			System.out.print("당신의 이름은 무엇입니까?");
			String name = sc.nextLine();
			
			System.out.print(name + "님의 나이는 몇 살 입니까?");
			int age = sc.nextInt();
			
			System.out.println(name + "님의 나이는 " + age + "살 입니다.");
			
			
	}

}
