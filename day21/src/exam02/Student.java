package exam02;

public class Student {
	String name;
	int money;
	
	public Student() {
		
	}
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {		//메인에서 Bus타입의 참조변수를 넣어주었음으로 Bus타입의 새로운 임시변수로 매개변수를 받음 
		System.out.println(name + "님이 " + bus.number + "번 버스에 탔습니다.");
		bus.take(1000);
		this.money -= 1000;		//버스요금 1000
	}
	
	public void takeSubway(Subway subway) {
		System.out.println(name + "님이 " + subway.line + "호선 지하철에 탔습니다.");
		subway.take(1500);;
		this.money -= 1500;		//지하철요금 1500 
	}
	
	public void showInfo() {
		System.out.println(name + "님은 현재 " + money + "원을 가지고 있습니다.");	
	}
}
