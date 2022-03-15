package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DBTest11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement pstmt = null;

		String user = "tester";
		String password = "1234";
		String url = "jdbc:oracle:thin:@192.168.0.109:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Ŭ���� �ε� ����!");

			StringBuffer sql = new StringBuffer();
			sql.append("delete from \"INFO\" where \"NUM\"=?");

			System.out.print("������ ��ȣ:");
			int deleteNum = Integer.parseInt(in.nextLine());

			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, deleteNum);

			int result = pstmt.executeUpdate(); // insert, update, delete

			System.out.println(result + "���� �����Ǿ����ϴ�.");

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
