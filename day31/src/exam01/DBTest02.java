package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String user = "tester";
		String pwd = "1234";
		String url = "jdbc:oracle:thin:@192.168.0.109:1521:xe";

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Ŭ���� �ε� ����!");

			System.out.println("�˻��� ��ȣ �Է� : ");
			int searchNum = sc.nextInt();
			System.out.println("�˻��� �̸� �Է� : ");
			String searchName = sc.nextLine();

			String sql = "select \"NUM\", \"NAME\", \"BIRTH\", \"ADDRESS\" from \"INFO\" where \"NAME\" = ? or \"NUM\" = ?";

			conn = DriverManager.getConnection(user, pwd, url);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchName); // (1��° ����ǥ, �Է¹��� �̸�)
			pstmt.setInt(2, searchNum); // (2��° ����ǥ, �Է¹��� ������ ��)

			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDate(3));
				System.out.println(rs.getString(4));
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
