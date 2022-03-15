package exam03;
/*
 * 다른 패키지에 클래스를 사용하는 방법
 * import(의 의미 : )  패키지이름.생성자;
 * 
 * 2차원 좌표를 저장하기 위한 클래스 
 * 	접근제한자
 * 	클래스 멤버에 대한 접근을 제한하는 키워드 
 * 
 * 		private : 클래스 내부에서만 직접 접근이 가능 
 * 		-멤버에 대한 접근이 가능하게 만드는 메서드
 * 			setter() : 값을 설정하는 메서드 
 * 			getter() : 값을 반환하는 메서드 
 * 
 * 		public : 어디서든 접근 가능 
 * 		protected : 같은 패키기에서와 상속관계일때만  접근 가능
 * 		default : 동일한 패키지안에서만 접근 가능  
 * */
public class Exam01 {
	public static void main(String[] args) {
		Point po1 = new Point();
		
	po1.setX(11);
	po1.setY(22);
	System.out.println(po1.pointToString());
	
	System.out.println(po1.getX());
	System.out.println(po1.getY());
		
		
		
		
		
	}
		
}
