package FoodSurvey;

import java.util.ArrayList;

public class FoodSurvey implements SurveyService {

	private FoodDAO fd;

	public FoodSurvey(FoodDAO fd) {
		this.fd = fd;
	}

	@Override
	public void vote(String food) {
		fd.update(food);
		System.out.println("1표가 등록되었습니다.");
		System.out.println();
	}

	public void insert(FoodVO fv) {
		fd.insert(fv);
		System.out.println("1표가 등록되었습니다.");
		System.out.println();
	}

	public ArrayList<FoodVO> select() {
		return fd.select();
	}

}
