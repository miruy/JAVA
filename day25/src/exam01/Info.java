package exam01;

public class Info {
	private String name;
	private int age;
	private int id = 0;
	
	public Info() {
		
	}
	
	public Info(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("[번호 : \"%d\", name : \"%s\", age : \"%d\"]", id, name, age);
	}
	
}
