package Food2;

import java.sql.SQLException;
import java.util.Scanner;

public class FoodMain {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		OjdbcTemplate ojdbcTemplate = new OjdbcTemplate();
		FoodDAO fd = new FoodDAO(ojdbcTemplate);
		boolean boo = true;

		
		while (boo) {
			System.out.println("  * 좋아하는 음식 설문조사 *");
			System.out.println("1.설문 참여하기  2.설문 현황보기  3.종료");
			System.out.print("선택 : ");
			int num = sc.nextInt();
			if (num == 3) {
				System.out.println("설문조사를 종료합니다.");
				boo = false;
			} else if (num == 1) {
				System.out.println("1.한식  2.중식  3.양식  4.일식  5.이태리식  6.기타(직접입력)");
				System.out.print("선택 : ");
				int cho = sc.nextInt();
				sc.nextLine();

				if (cho == 1) {
					fd.update("한식");
				} else if (cho == 2) {
					fd.update("중식");
				} else if (cho == 3) {
					fd.update("양식");
				} else if (cho == 4) {
					fd.update("일식");
				} else if (cho == 5) {
					fd.update("이태리식");
				} else if (cho == 6) {
					System.out.print("좋아하는 음식 입력 : ");
					String newFood = sc.nextLine();
					FoodVO fv = new FoodVO();
					fv.setMenu(newFood);
					fv.setVote(1);
					fd.insert(fv);
				}

			} else if (num == 2) {
				System.out.println(fd.select());
			} else {
				System.out.println("잘못 선택하셨습니다.");
			}
		}

	}

}
