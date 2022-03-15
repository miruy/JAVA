package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CafeInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String user = "tester";
		String password = "1234";
		String url = "jdbc:oracle:thin:@192.168.0.109:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("클래스 로딩 성공!");

			StringBuffer sql = new StringBuffer();
			sql.append("insert into \"CAFE\" (\"NUM\", \"ID\", \"PASSWORD\", \"RESIDENCE\", \"ENROLLMENT\", \"RATING\")");
			sql.append("values(\"CAFE_SEQ\".nextval, ?, ?, ?, systimestamp, ?)");

			System.out.println("아이디 입력 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호 입력 : ");
			String pw = sc.nextLine();
			System.out.println("거주지역 입력 : ");
			String resid = sc.nextLine();
			System.out.println("회원등급[일반회원(1), 관리자(5)]입력 : ");
			int rat = sc.nextInt();

			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, resid);
			pstmt.setInt(4, rat);

			int result = pstmt.executeUpdate();

			if (result == -1) {
				System.out.println("삽입 실패");
			} else {
				System.out.println(result + "행이 삽입되었습니다.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
