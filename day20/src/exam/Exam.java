
package exam;

class A{
	int a;
	A(){	//디폴트 생성자 
		System.out.println("A()");
	}
	A(int a){	//생성자 오버로딩 
		System.out.println("A(int a)");
	}
	void methodA() { System.out.println("A");}	//메서드 
}
class B extends A{	//클래스B(자식)가 클래스A(부모)를 상속함 
	int b;
	B(){	//디폴트 생성자 
//		super();  - super : 부모클래스의 디폴트 생성자를 부르는 예약어(=this) 
		super(10); //super() : 부모클래스의 오버로딩 생성자를 부르는 예약어 
		System.out.println("B()");
	}
	void methodB() { System.out.println("B");}	//메서드 
}
class C extends B{	//C클래스(자식)가 B클래스(부모)를 상속한다. 
	int c;
	C(){
		super();	//B클래스가 A클래스를 우선 상속하고 있으므로 A클래스의 생성
		System.out.println("C()");
	}
	void methodC() { System.out.println("C");}
}

public class Exam {
	public static void main(String[] args) {
		C ob = new C();	//C객체 생성 
		
		//C클래스가 B클래스를 상속하고, B클래스가 A클래스를 상속하므로
		//C객체로 A와B클래스의 변수 및 메서드를 사용할 수 있다. 
		ob.a = 10;		 
		ob.b = 20;
		ob.c = 30;
		ob.methodA();
		ob.methodB();
		ob.methodC();
	}
}
