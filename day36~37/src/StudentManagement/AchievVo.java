package StudentManagement;

public class AchievVo {
	int scoreNum;
	int score;
	String grade;
	int id;
	int subjectNum;
	
	public AchievVo() {}
	
	public AchievVo(int scoreNum, int score, String grade, int id, int subjectNum) {
		this.scoreNum = scoreNum;
		this.score = score;
		this.grade = grade;
		this.id = id;
		this.subjectNum = subjectNum;
	}

	public int getScoreNum() {
		return scoreNum;
	}

	public void setScoreNum(int scoreNum) {
		this.scoreNum = scoreNum;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSubjectNum() {
		return subjectNum;
	}

	public void setSubjectNum(int subjectNum) {
		this.subjectNum = subjectNum;
	}

	@Override
	public String toString() {
		return "성적번호 : " + scoreNum + ", 점수 : " + score + ", 학점 : " + grade
				+ ", 학번 : " + id + ", 과목번호 : " + subjectNum;
	}
	
	
}
