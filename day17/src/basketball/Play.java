package basketball;

public class Play {

	Score score;

	private int count; // 횟수

	public void throwBall() {
		count++;
		if (count == 3) {

		}
	}

	public void timeOver() {
		System.out.println("현재 횟수  : " + count + "회\n게임을 종료합니다. ");
	}

	public void count() {
		count++;
		System.out.println("현재 횟수 : " + count + "회");
	}

	// 사용자가 임의로 초기화 가능
	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}
