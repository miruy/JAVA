package exam02;

public class GoToTheSchool {

	public static void main(String[] args) {
		Student yurim = new Student("김유림",5000);
		Bus bus1144 = new Bus(1144);
		
		yurim.showInfo();
		yurim.takeBus(bus1144);
		bus1144.showInfo();
		yurim.showInfo();
		bus1144.takeOff();
		bus1144.showInfo();
		
		System.out.println();
		
		Student myenghan = new Student("이명한", 10000);
		Subway subway2 = new Subway(2);
		myenghan.takeSubway(subway2);
		subway2.showInfo();
		myenghan.showInfo();
		subway2.takeOff();
		subway2.showInfo();
		
	}

}
