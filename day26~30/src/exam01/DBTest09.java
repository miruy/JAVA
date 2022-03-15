package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DBTest09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement pstmt = null;

		String user = "tester";
		String password = "1234";
		String url = "jdbc:oracle:thin:@192.168.0.109:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("클래스 로딩 성공!");

			StringBuffer sql = new StringBuffer();
			sql.append("insert into \"INFO\" (\"NUM\", \"NAME\", \"BIRTH\", \"ADDRESS\")");
			sql.append(" values (\"INFO_SEQ\".nextval, ?, sysdate, ?)");

			System.out.print("저장할 이름:");
			String name = in.nextLine();
			System.out.print("저장할 주소:");
			String address = in.nextLine();

			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, name);
			pstmt.setString(2, address);

			int result = pstmt.executeUpdate(); // CRUD 중 insert, update, delete는 executeUpdate메서드 사용함 -> 이유 :결과가 반환되는 것이 아니라 확인용글이 출력됨(EX : 1행이 삽입되었습니다.) 

			if (result == -1) {
				System.out.println("삽입 실패!");
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
