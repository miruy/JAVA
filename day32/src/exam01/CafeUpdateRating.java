package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CafeUpdateRating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;

		String user = "tester";
		String password = "1234";
		String url = "jdbc:oracle:thin:@192.168.0.109:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("클래스 로딩 성공!");

			StringBuffer sql = new StringBuffer();
			sql.append("update \"CAFE\" set \"RATING\" = ?");
			sql.append(" where \"NUM\" = ?");

			System.out.println("변경할 회원의 회원번호 입력 : ");
			long num = sc.nextLong();
			sc.nextLine();
			System.out.println("변경할  등급 입력(1~5) : ");
			long resid = sc.nextLong();

			if (resid > 5) {
				System.out.println("등급 기준을 초과했습니다.");
			} else {
				conn = DriverManager.getConnection(url, user, password);
				pstmt = conn.prepareStatement(sql.toString());
				pstmt.setLong(1, resid);
				pstmt.setLong(2, num);

				int result = pstmt.executeUpdate();

				if (result == -1) {
					System.out.println("변경 실패!");
				} else {
					System.out.println(result + "행이 변경되었습니다.");
				}
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
