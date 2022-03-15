package exam03;

public class SunFlower extends Plant implements Yellow{
	String height;
	
	public SunFlower() {
		
	}
	
	public SunFlower(String height) {
		this.height = height;
	}
	
	public void lookAtTheSun() {
		System.out.println("해를 바라본다.");
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

	@Override
	public void yellowColor() {		//YellowFlower클래스의 메서드 오버라이딩 
		System.out.println("진한 노랑색");
	}


}
