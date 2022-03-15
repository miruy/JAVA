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
			System.out.println("Ŭ���� �ε� ����!");

			StringBuffer sql = new StringBuffer();
			sql.append("insert into \"INFO\" (\"NUM\", \"NAME\", \"BIRTH\", \"ADDRESS\")");
			sql.append(" values (\"INFO_SEQ\".nextval, ?, sysdate, ?)");

			System.out.print("������ �̸�:");
			String name = in.nextLine();
			System.out.print("������ �ּ�:");
			String address = in.nextLine();

			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, name);
			pstmt.setString(2, address);

			int result = pstmt.executeUpdate(); // CRUD �� insert, update, delete�� executeUpdate�޼��� ����� -> ���� :����� ��ȯ�Ǵ� ���� �ƴ϶� Ȯ�ο���� ��µ�(EX : 1���� ���ԵǾ����ϴ�.) 

			if (result == -1) {
				System.out.println("���� ����!");
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
