package exam;

public class Battery {

	// 멤버변수
	int capacity;
	int charge;
	int use;
	// 멤버메서드

	void inputBattery() {
		System.out.println("건전지 삽입 - 현재 배터리 : " + capacity);
	}

	int useElec(int a) {
		capacity -= a;
		System.out.println("사용한 배터리 : " + a);
		System.out.println("사용 후 현재 배터리 : " + capacity);
		return capacity;
	}

	int chargeElec(int a) {
		capacity += a;
		System.out.println("충전 후 현재 배터리 : " + capacity);
		return capacity;
	}

}
