package exam02;

public class Dog extends Animal implements water{
	@Override
	void eat() {
		System.out.println("개처럼 먹는다.");
	}
	@Override
	void walk() {
		System.out.println("개처럼 걷는다.");
	}
	
	void onlyDog() {
		System.out.println("개만 가지는 기능");
	}
	
	@Override
	public void methodInWater() {
		System.out.println("개가 물에서 헤엄 칠 수있다. ");
		
	}
	
}
