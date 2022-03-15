package exam02;

public class AnimalMain {
	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();
		dog.walk();
		dog.onlyDog();

		Cat cat = new Cat();
		cat.eat();
		cat.walk();
		cat.onlyCat();

		Animal[] ani = new Animal[] { dog, cat }; // 업캐스팅을 배열로 간편하게 관리
		for (int i = 0; i < ani.length; i++) {
			ani[i].eat();
			ani[i].walk();

			if (ani[i] instanceof Dog) { // 다운캐스팅
				Dog imsi = (Dog) ani[i];
				imsi.onlyDog();
			}
		}
//		Animal a = new Animal(); //Animal이 추상클래스이기때문에 객체생성 불가능 

		/*
		 * has ~ a 관계 : 공통점이 없는 객체가 서로 연결지어야져야 할때 (tv,리모컨/인형,배터리 등)
		 * is ~ a 관계 : 공통점이 있는 객체가 서로 연결지어져야 할때 (고양이,개/ 포유류,어류 )
		 *
		 * 다중 상속 불가능 -> ex : b,c를 상속받는 d가 있는데, b,c가 a를 상속받는 것 
		 * - 하지만 a가 추상클래스인 경우는 가능(재정의를 d에서 해야하기 때문에)-> 인터페이스!
		 * implements 를 이용해 인터페이스를 연결해준 후 연결된 객체에 오버라이딩을 해주면 
		 * 위와 같이 배열을 이용한 업캐스팅 가능
		 */

	}
}
