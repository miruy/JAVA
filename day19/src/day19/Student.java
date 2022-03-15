package day19;

public class Student {

	// 멤버변수
	int studentID;
	String studentName;
	int grade;
	String address;

	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
		
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
	public static void main(String[] args) {
		//디폴트 생성자를 이용한 studentAhn객체 생성 
		Student studentAhn = new Student();
		
		//같은 의미 
		
		//참조연산자를 이용한 초기화 
		studentAhn.studentName = "안연수";  
		System.out.println(studentAhn.studentName);
		
		//setter 
		studentAhn.setStudentName("안연수");
		//getter
		System.out.println(studentAhn.getStudentName());
	}
}
