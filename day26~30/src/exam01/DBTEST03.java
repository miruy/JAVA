package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTEST03 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;	// �����ÿ� ���ڰ� �� 
		ResultSet rs = null;
		String user = "tester";
		String password = "1234";
		String url = "jdbc:oracle:thin:@192.168.0.109:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Ŭ���� �ε� ����!");

//			StringBuffer sql = new StringBuffer();
//			sql.append("select \"NAME\", \"NUM\", \"BIRTH\" from \"INFO\"");
//			sql.append(" where \"NUM\"=?");
			String sql = "select \"NAME\", \"NUM\", \"BIRTH\" from \"INFO\" where \"NUM\"=?";

			int searchNum = 3;

			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, searchNum); //sql������ ���� ������ �� ?�� �� ���� searchNum�� ����

			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getString("NAME"));
				System.out.println(rs.getLong(2));
				System.out.println(rs.getDate(3));
				System.out.println();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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
