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
			System.out.println("Ŭ���� �ε� ����!");

			StringBuffer sql = new StringBuffer();
			sql.append("update \"CAFE\" set \"RATING\" = ?");
			sql.append(" where \"NUM\" = ?");

			System.out.println("������ ȸ���� ȸ����ȣ �Է� : ");
			long num = sc.nextLong();
			sc.nextLine();
			System.out.println("������  ��� �Է�(1~5) : ");
			long resid = sc.nextLong();

			if (resid > 5) {
				System.out.println("��� ������ �ʰ��߽��ϴ�.");
			} else {
				conn = DriverManager.getConnection(url, user, password);
				pstmt = conn.prepareStatement(sql.toString());
				pstmt.setLong(1, resid);
				pstmt.setLong(2, num);

				int result = pstmt.executeUpdate();

				if (result == -1) {
					System.out.println("���� ����!");
				} else {
					System.out.println(result + "���� ����Ǿ����ϴ�.");
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
