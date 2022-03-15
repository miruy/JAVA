package exam;
/*
 * 클래스
 *  클래스는 자료형
 *  객체를 정의해 놓은 것(객체가 가지는 속성과 기능을 정의)
 *  객체와 클래스는 다르다.
 *  클래스를 바탕으로 만들어진 실체(객체)
 *  하나의 파일에 하나의 클래스 정의(권장)
 *  public class의 이름은 파일의 이름과 동일(필수) 
 *  객체지향 프로그램은 객체들의 메시지 교환으로 동작함(현실세계)
 */
public class TvMain {

	public static void main(String[] args) {
		/* 메소드 기능
		 * power() 
		 * display()
		 * volUp()
		 * volDown()
		 * chUp()
		 * chDown()
		 */
		TV tv1 = new TV();
		Remote ctrl1 = new Remote();
		
		ctrl1.tv = tv1;  
		tv1.brand = "삼성";
		
		tv1.brand();
		tv1.power();
		tv1.volUp();
		tv1.volDown();
		tv1.chUp();
		tv1.chDown();
		
		TV tv2 = new TV();
		Remote ctrl2 = new Remote();
		
		ctrl2.tv = tv2;
		tv2.brand = "LG";
		
		tv2.brand();
		ctrl2.power();
		ctrl2.volUp();
	}

}
