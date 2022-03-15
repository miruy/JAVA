package day19;

public class Person {

	//멤버변수 
	String name;
	double height;
	double weight;
	
	//디폴트 생성자 
	public Person() {
		
	}
	
	public Person(String name) {
		name = name;
	}
	
	public Person(String name, double height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
}