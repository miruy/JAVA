package exam02;

public class Cat extends Animal{
	@Override
	void eat() {
		System.out.println("고양이처럼 먹는다.");
	}
	
	@Override
	void walk() {
		System.out.println("고양이처럼 걷는다.");
	}
	
	void onlyCat() {
		System.out.println("고양이만 가지는 기능");
	}
	
}
