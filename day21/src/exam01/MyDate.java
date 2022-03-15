package exam01;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("오류입니다.");
			} else {
				this.day = day;
			}
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isValid() {
			if (day < 1 || day > 28) {
				System.out.println("유효하지 않은 날짜입니다.");
				return true;
			} else {
				System.out.println("유효한 날짜입니다.");
				return false;
			}
		}


	public MyDate() {

	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
}
