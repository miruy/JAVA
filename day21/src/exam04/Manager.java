package exam04;

public class Manager {
	int bonusPoint; //보너스 포인트 
	double ratio; 	//적립 비율 
	String grade;	//고객 등급
	
	public Manager() {
		grade = "SILVER";	//실버등급부터 시작 
		ratio = 0.01;		//기본 적립 비율 
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * ratio;
		return price;
	}
	
	public void showInfo() {
		System.out.println("님의 등급은 " + grade + "등급이며, 적립된 보너스 포인트는 " + bonusPoint + "입니다.");
	}
}
