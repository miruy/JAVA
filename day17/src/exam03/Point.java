package exam03;

/*
 * 2차원 좌표를 저장하기 위한 클래스 
 */
public class Point {
	int x = -1; // 직접 초기화
	int y = -1;
	
	

	public void setX(int n) {          		//setter 메서드 - 메인에서 메소드에 인자값 주듯이 사용 
		x = n;
	}

	public void setY(int n) {
		y = n;
	}

	public int getX(){								//getter 메서드 - 출력기능에 메서드 부르기 
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	
	{ // 블록초기화
		System.out.println("초기화 블록");
		x = 1;
		for (int i = x; i < 10; i++) {
			y += x;
			// 아무데나 중괄호 블록 쓰기 이안에서 초기화
		}
	}

	Point() {
		System.out.println("디폴트 생성자"); // 목적은 변수 초기화하는 목적
		x = 0;
		y = 0;
	}

	Point(int n1, int n2) {
		System.out.println("오버로딩된 생성자");
		x = n1;
		y = n2;
	}

	String pointToString() {
		return "[x = " + x + ", y = " + y + "]";
	}
}
