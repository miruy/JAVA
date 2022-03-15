package exam;

public class TestC extends TestA{
	//Override (재정의)
	@Override
	void methodA() {
		System.out.println("CA");
	}
	void methodC() {
		System.out.println("C");
	}
}