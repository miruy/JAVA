package day19;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person();
		
		personLee.name = "이유신";
		personLee.height = 186.7;
		personLee.weight = 70.8;
		
		Person personKim = new Person("김순신", 161.1, 69.4);
		
		System.out.println(personLee.name);
		System.out.println(personLee.height);
		System.out.println(personLee.weight);
		
		System.out.println(personKim.name);
		System.out.println(personKim.height);
		System.out.println(personKim.weight);

	}

}
