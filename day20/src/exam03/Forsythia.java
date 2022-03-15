package exam03;

public class Forsythia extends Plant implements Yellow { // 개나리
	int color;
	int floweringWater = 10;

	public Forsythia() {
		
	}

	public Forsythia(int color) {
		this.color = color;
	}

	public int water(int water) {
		return floweringWater -= water;
	}
	
	public void floweringTime() {
		System.out.println("봄");
	}

	@Override // 식물클래스의 메서드 오버라이딩
	public void needWater() {
		System.out.println("물 필요");
	}

	@Override
	public void needSoil() {
		System.out.println("흙 필요");
	}

	@Override
	public void needSun() {
		System.out.println("햇빛 필요");
	}

	@Override
	public void yellowColor() { // YellowFlower클래스 메서드 오버라이딩
		System.out.println("밝은 노랑색");
	}
}
