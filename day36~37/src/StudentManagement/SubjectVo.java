package StudentManagement;

public class SubjectVo {
	private int subjectNum;
	private String subjectName;
	
	public SubjectVo() {}
	
	public SubjectVo(int subjectNum, String subjectName) {
		this.subjectNum = subjectNum;
		this.subjectName = subjectName;
	}

	public int getSubjectNum() {
		return subjectNum;
	}

	public void setSubjectNum(int subjectNum) {
		this.subjectNum = subjectNum;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "과목 번호 : " + subjectNum + ", 과목 이름 : " + subjectName;
	}
	
}
