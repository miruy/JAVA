package exam02;

public class Subway {
	int line;	//호선
	int passenger;	//승객 
	int earnings;  //수입 

	public Subway(int line) {	//매개변수로 호선의 번호를 받는 오버로딩 생성자
		this.line = line;
	}
	
	public void take(int pay) { 
		passenger++;				
		earnings += pay;		 
		System.out.println("승객이 " + line + "호선 지하철에 탔습니다.");
	}
	
	public void takeOff() {			//버스를 내리는 기능, 승객의 수가 줄어듬  
		passenger--;
		System.out.println("승객이 " + line + "호선 지하철에서 내립니다.");
	}

	public void showInfo() {
		System.out.println("지하철의 승객은 " + passenger + "명이고, 수입은 " + earnings + "입니다.");
	}
}
