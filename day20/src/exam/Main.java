package exam;

public class Main {
	public static void main(String[] args) {
		//부모클래스의 참조변수는 자식 객체를 참조할 수 있음(다형성)
		TestA oba = new TestA();
		TestA obb = new TestB(); //업캐스팅
		TestA obc = new TestC();
		
		oba.methodA();
		obb.methodA(); //재정의된 자식 메서드가 호출(동적 바인딩)
		obc.methodA();
		
		TestA[] ob = new TestA[] { oba, obb, obc };
		for(int i = 0; i < ob.length; i++) {
			ob[i].methodA();
		}
		System.out.println("--------");
		TestB tmp = (TestB)obb; //다운캐스팅
		System.out.println(obb);
		System.out.println(tmp);
		tmp.methodB(); //다운캐스팅 후 자식 멤버 사용 가능
		
		System.out.println(obb instanceof TestA);
		System.out.println(obb instanceof TestC);
		
		for(int i = 0; i < ob.length; i++) {
			ob[i].methodA();
			if(ob[i] instanceof TestB) {
				TestB b = (TestB)ob[i];
				b.methodB();
			}else if(ob[i] instanceof TestC) {
				TestC c = (TestC)ob[i];
				c.methodC();
			}
		}
		System.out.println("--------");
	}
}

