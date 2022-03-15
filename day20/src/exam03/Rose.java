package exam03;

public class Rose extends Plant{
	String color;
	String thorn;
	
	public Rose() {
		
	}
	
	public Rose(String color, String thorn) {
		this.color = color;
		this.thorn = thorn;
	}
	
	public void	color() {
	System.out.println("빨강색");
	}
	
	public void Thorn() {	//가시 
		System.out.println("가시가 있는 꽃");
	}
	
	public void floweringTime() {
		System.out.println("여름, 가을");
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
}
