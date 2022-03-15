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
			System.out.println("Ŭ���� �ε� ����!");

			StringBuffer sql = new StringBuffer();
			sql.append("insert into \"CAFE\" (\"NUM\", \"ID\", \"PASSWORD\", \"RESIDENCE\", \"ENROLLMENT\", \"RATING\")");
			sql.append("values(\"CAFE_SEQ\".nextval, ?, ?, ?, systimestamp, ?)");

			System.out.println("���̵� �Է� : ");
			String id = sc.nextLine();
			System.out.println("��й�ȣ �Է� : ");
			String pw = sc.nextLine();
			System.out.println("�������� �Է� : ");
			String resid = sc.nextLine();
			System.out.println("ȸ�����[�Ϲ�ȸ��(1), ������(5)]�Է� : ");
			int rat = sc.nextInt();

			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, resid);
			pstmt.setInt(4, rat);

			int result = pstmt.executeUpdate();

			if (result == -1) {
				System.out.println("���� ����");
			} else {
				System.out.println(result + "���� ���ԵǾ����ϴ�.");
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
