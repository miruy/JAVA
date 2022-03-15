package exam02;

public class Bus {
	int number;
	int passenger;	//승객
	int earnings;  //수입 
	
	
	public Bus(int number) {		//오버로딩 생성자로 객체생성 시 매개변수로 받은 버스번호로 초기화 됨 
		this.number = number;
	}
	
	public void take(int pay) {//버스를 타는 기능, 메인에서 입력하는(버스요금)을 이버스의 수입으로 받음 
		passenger++;				//take()를 호출할때마다 승객의 수가 누적됨
		earnings += pay;		//매개변수로 받은 메인에서의 버스요금은 이버스의 수입으로 들어와 누적됨 
		System.out.println("승객이 " + number + "번 버스에 탔습니다.");
	}
	
	public void takeOff() {			//버스를 내리는 기능, 승객의 수가 줄어듬  
		passenger -= 1;
		System.out.println("승객이 " + number + "번 버스에서 내립니다.");
	}

	public void showInfo() {
		System.out.println(number + "번 버스의 승객은 " + passenger + "명이고, 수입은 " + earnings + "입니다.");
	}
}
