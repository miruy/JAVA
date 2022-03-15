package exam03;

public class Child extends Parent {
	@Override
	public void methodParentA() {
		System.out.println("ParentA-B");
	}

	void methodChild() {
		super.methodParentA();
		methodParentA();
	}

}
