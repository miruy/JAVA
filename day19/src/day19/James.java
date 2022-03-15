package day19;

public class James {
	
	int age;
	String name;
	boolean married;
	int children;
	
	public static void main(String[] args) {
		
		James james = new James();
		
		james.age = 40;
		james.name = "james";
		james.married = true;
		james.children = 3;
		
		System.out.println("이 사람의 나이 : " + james.age + "살");
		System.out.println("이 사람의 이름 : " + james.name);
		System.out.println("이 사람의 결혼 여부 : " + james.married);
		System.out.println("이 사람의 자녀 수 : " + james.children);
	}

}
