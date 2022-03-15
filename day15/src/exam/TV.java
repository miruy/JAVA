package exam;

public class TV {
	// 멤버변수
	String brand;
	boolean power;
	int ch;
	int vol;
	int selet;

	// 멤버메소드
	void power() {
		power = !power; // TV가 처음에 꺼져있음을 의미(power메소드를 불렀을 때 켜질수 있도록)
		if (power) {
			display();
		}
	}

	void display() {
		System.out.println("TV가 켜졌습니다.");
		if (power) {
			System.out.println("현재채널 : " + ch);
			System.out.println("현재볼륨 : " + vol);
		} else {
			System.out.println("TV가 꺼져있습니다.");
		}
		System.out.println();
	}
	
	void brand() {
		System.out.println("*" + brand + "TV*");
	}

	void volUp() {
		System.out.println("현재볼륨 : " + ++vol);
		System.out.println();
	}

	void volDown() {
		System.out.println("현재볼륨 : " + --vol);
		System.out.println();
	}

	void chUp() {
		System.out.println("현재채널 : " + ++ch);
		System.out.println();
	}

	void chDown() {
		System.out.println("현재채널 : " + --ch);
		System.out.println();
	}

	
}
