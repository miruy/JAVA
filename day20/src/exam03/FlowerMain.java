package exam03;

public class FlowerMain {

	public static void main(String[] args) {
		Rose ros = new Rose();
		SunFlower sunF = new SunFlower();
		Forsythia fors = new Forsythia();
//		ros.color();
//		sunF.needSoil();
//		fors.needSun();

		Plant[] pla = new Plant[] { ros, sunF, fors }; // 꽃 클래스들을 식물 클래스 배열로 업 캐스팅
		for (int i = 0; i < pla.length; i++) {
			pla[i].needSoil();
			pla[i].needSun();
			pla[i].needWater();
//			pla[i].thorn(); 
			// 식물크래스의 타입이므로 rose의 가시메서드가 보이지 않음

			if (pla[i] instanceof Rose) { // pla가 부모클래스인지 자식클래스인지 확인
				Rose ros2 = (Rose) pla[i]; // Rose 타입 임시변수에 pla[i]를 다운 캐스팅(부모타입 -> 자식타입)
				ros2.Thorn(); // 다운캐스팅을 하면 해당 객체만의 기능을 실현할 수 있음
				ros2.color();
				ros2.floweringTime();
			}

			if (pla[i] instanceof SunFlower) {
				SunFlower sunF2 = (SunFlower) pla[i];
				sunF2.floweringTime();
				sunF2.height = "크다";
				System.out.println(sunF2.height);
				sunF2.lookAtTheSun();
				sunF2.yellowColor();
			}
			if (pla[i] instanceof Forsythia) {
				Forsythia fors2 = (Forsythia) pla[i];
				fors2.yellowColor();
				fors2.floweringTime();
			}
		}
		//인터페이스로 묶은 객체 배열로 생성 
		Yellow[] yel = new Yellow[] { sunF, fors };
		for(int i = 0; i < yel.length; i++) {
			yel[i].yellowColor();
		}
	}

}
