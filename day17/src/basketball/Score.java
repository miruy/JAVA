package basketball;

public class Score {

	Play play;

	int score; // 던질때마다 점수
	int total; // 총 점
	boolean over = true;
	
	public int score(int score) {
		while (over) {
			if(score == 1) {
				System.out.println("1");
				
			}else if(score == 2) {
				System.out.println("2");
			}else if(score == 3) {
				System.out.println("3");
			}else if(play.getCount() == 3) {
				over = false;
			}
		}
		return score;
	}

	public void total() {
		System.out.println("총 " + total + "점");
	}

	public void Score(int score) {
		this.score = score;
	}
}
