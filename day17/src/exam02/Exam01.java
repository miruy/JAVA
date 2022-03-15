package exam02;

/*
 * 2차원 좌표를 저장하기 위한 클래스 
 * 		객체의 초기화 
 *		멤버 필드의 값에 초기값을 지정하지 않으면 G.C를 통해 디폴트 값으로 초기화 됨 
 *		-직접 초기화
 *
 *		-블록초기화 
 *
 *		-생성자 초기화 -객체 생성 시 반드시 호출 
 *		생성자는 클래스 이름과 동일한 멤버메서드 
 *		생성자가 하나도 없다면 디폴트 생성자를 자동으로 호출 
 *		생성자는 반환하는 값이 없음 
 *		생성자는 오버로딩이 가능 
 */
public class Exam01 {
	public static void main(String[] args) {
		Point po1 = new Point();
		System.out.println(po1.pointToString());
		
		Point po2 = new Point(10,20);
		System.out.println(po2.pointToString());
		
		String str = new String();
		String str2 = new String("hello");
		String str3 = new String(new char[] {'a', 'n'});
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
		
		
		
		
		
		
	}
		
}
