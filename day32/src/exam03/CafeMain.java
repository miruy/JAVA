package exam03;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		CafeManager cm = new CafeManager();
		boolean boo = true;

		while (boo) {
			System.out.println("     *인터넷 카페 회원 관리 프로그램*");
			System.out.println("1.등록    2.검색    3.수정    4.삭제    5.종료");
			System.out.print("입력 : ");
			int select = sc.nextInt();
			sc.nextLine();
			if (select == 5) {
				System.out.println("종료합니다.");
				boo = false;
			} else if (select == 1) {
				System.out.println("아이디 입력 : ");
				String id = sc.nextLine();
				System.out.println("비밀번호 입력 : ");
				String pwd = sc.nextLine();
				System.out.println("거주지역 입력 : ");
				String resid = sc.nextLine();
				System.out.println("회원등급[일반회원(1), 관리자(5)]입력 : ");
				long rat = sc.nextInt();
				sc.nextLine();
				cm.insert(id, pwd, resid, rat);
			} else if (select == 2) {
				System.out.println("1.아이디	2.거주지	3.등록일  4.전체");
				System.out.print("검색 방법 입력 : ");
				int choice = sc.nextInt();
				sc.nextLine();
				if (choice == 1) {
					System.out.println("아이디 입력 : ");
					String searchId = sc.nextLine();
					cm.select1(searchId);
				} else if (choice == 2) {
					System.out.println("거주지 입력 : ");
					String searchResid = sc.nextLine();
					cm.select2(searchResid);
				} else if (choice == 3) {
					System.out.println("등록일로 검색(ex:YY/MM/DD): ");
					String searchEnrom = sc.nextLine();
					cm.select3(searchEnrom);
				}else if (choice == 4) {
					cm.selectAll();
				}
			} else if (select == 3) {
				System.out.println("1.아이디	2.비밀번호   3.거주지역   4.등급");
				System.out.print("수정 방법 입력 : ");
				int choice = sc.nextInt();
				sc.nextLine();
				if (choice == 1) {
					System.out.println("변경할 회원의 회원번호 입력 : ");
					int num = sc.nextInt();
					sc.nextLine();
					System.out.println("변경할 아이디 입력 : ");
					String id = sc.nextLine();
					cm.update1(num, id);
				} else if (choice == 2) {
					System.out.println("변경할 회원의 회원번호 입력 : ");
					int num = sc.nextInt();
					sc.nextLine();
					System.out.println("기존 비밀번호 입력 : ");
					String oriPwd = sc.nextLine();
					System.out.println("변경할 비밀번호 입력 : ");
					String newPwd = sc.nextLine();
					cm.update2(num, oriPwd, newPwd);
				} else if (choice == 3) {
					System.out.println("변경할 회원의 회원번호 입력 : ");
					int num = sc.nextInt();
					sc.nextLine();
					System.out.println("거주지역 입력 : ");
					String resid = sc.nextLine();
					cm.update3(num, resid);
				} else if (choice == 4) {
					System.out.println("변경할 회원의 회원번호 입력 : ");
					int num = sc.nextInt();
					sc.nextLine();
					System.out.println("변경할  등급 입력(1~5) : ");
					long enrom = sc.nextLong();
					cm.update4(num, enrom);
				}

			} else if (select == 4) {
				System.out.println("삭제할 회원의 회원번호 입력 : ");
				int num = sc.nextInt();
				sc.nextLine();
				System.out.println("비밀번호 입력 : ");
				String pwd = sc.nextLine();
				cm.delete(num, pwd);
			}
		}

	}

}