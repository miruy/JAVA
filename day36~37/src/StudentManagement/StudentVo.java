package StudentManagement;

public class StudentVo {
	private int id;
	private String name;
	
	public StudentVo() {}
	
	public StudentVo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "학번 : " + id + ", 이름 : " + name;
	}
	
	
	
}
