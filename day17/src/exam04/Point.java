package exam04;

/*
 * 2차원 좌표를 저장하기 위한 클래스 
 */
public class Point {
	int x = -1;  //직접 초기화 
	int y = -1;
	
	
	{						//블록초기화
		System.out.println("초기화 블록");
		x = 1;
		for(int i = x; i < 10; i++)
		{
			y += x;
			// 아무데나 중괄호 블록 쓰기 이안에서 초기화 
		}
	}
	
	Point(){
		System.out.println("디폴트 생성자");  //목적은 변수 초기화하는 목적 
		x = 0;
		y = 0;   
	}
	
	Point(int x, int y){ 				//this : 나를 호출한 객체에다가 답는다. 같은 이름이 많으니 헷갈리지말고 담아라라는 의미 
		this.x = x;
		this.y = y;
		System.out.println("오버로딩된 생성자");
	}
	

	String pointToString() {
		System.out.println(this);
		return "[x = " + x + ", y = " + y + "]";
	}
}
